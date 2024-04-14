package com.macro.mall.service.impl;

import com.macro.mall.common.service.RedisService;
import com.macro.mall.service.IdRuleGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("OrderIdGenerator")
public class IdRuleGeneratorImpl implements IdRuleGenerator {

    @Value("${redis.database}")
    String REDIS_DATABASE;

    @Value("${redis.key.orderId}")
    String REDIS_KEY_ORDER_ID;

    @Autowired
    RedisService redisService;

    /**
     * 生成18位订单编号:前缀+8位日期+5位以上自增id
     */
    @Override
    public String generator(IdRuleType type) {
        StringBuilder sb = new StringBuilder();
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String key = REDIS_DATABASE+":"+ REDIS_KEY_ORDER_ID + date;
        Long increment = redisService.incr(key, 1);
        sb.append(type.getPrefix()).append(date);
        String incrementStr = increment.toString();
        if (incrementStr.length() <= 5) {
            sb.append(String.format("%05d", increment));
        } else {
            sb.append(incrementStr);
        }
        return sb.toString();
    }

}
