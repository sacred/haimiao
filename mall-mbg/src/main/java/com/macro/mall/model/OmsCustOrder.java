package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsCustOrder implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private String custOrderNo;

    @ApiModelProperty(value = "内地客户")
    private String localCust;

    @ApiModelProperty(value = "香港客户")
    private String hkCust;

    @ApiModelProperty(value = "品种")
    private String goodType;

    @ApiModelProperty(value = "规格")
    private String packingType;

    @ApiModelProperty(value = "整件件数")
    private Integer fclNumber;

    @ApiModelProperty(value = "每件重量")
    private BigDecimal unitWeight;

    @ApiModelProperty(value = "尾数件数")
    private Integer additionNumber;

    @ApiModelProperty(value = "尾数1重量（kg）")
    private BigDecimal additionWeight1;

    @ApiModelProperty(value = "尾数2重量（kg）")
    private BigDecimal additionWeight2;

    @ApiModelProperty(value = "总件数")
    private Integer totalNumber;

    @ApiModelProperty(value = "总重量(kg)")
    private BigDecimal totalWeight;

    @ApiModelProperty(value = "运费")
    private BigDecimal freightFee;

    @ApiModelProperty(value = "下单日期")
    private Date orderDate;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "状态，见SYS_ENUM.ORDER_STATE")
    private Integer state;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustOrderNo() {
        return custOrderNo;
    }

    public void setCustOrderNo(String custOrderNo) {
        this.custOrderNo = custOrderNo;
    }

    public String getLocalCust() {
        return localCust;
    }

    public void setLocalCust(String localCust) {
        this.localCust = localCust;
    }

    public String getHkCust() {
        return hkCust;
    }

    public void setHkCust(String hkCust) {
        this.hkCust = hkCust;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    public Integer getFclNumber() {
        return fclNumber;
    }

    public void setFclNumber(Integer fclNumber) {
        this.fclNumber = fclNumber;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(BigDecimal unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Integer getAdditionNumber() {
        return additionNumber;
    }

    public void setAdditionNumber(Integer additionNumber) {
        this.additionNumber = additionNumber;
    }

    public BigDecimal getAdditionWeight1() {
        return additionWeight1;
    }

    public void setAdditionWeight1(BigDecimal additionWeight1) {
        this.additionWeight1 = additionWeight1;
    }

    public BigDecimal getAdditionWeight2() {
        return additionWeight2;
    }

    public void setAdditionWeight2(BigDecimal additionWeight2) {
        this.additionWeight2 = additionWeight2;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(BigDecimal freightFee) {
        this.freightFee = freightFee;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", custOrderNo=").append(custOrderNo);
        sb.append(", localCust=").append(localCust);
        sb.append(", hkCust=").append(hkCust);
        sb.append(", goodType=").append(goodType);
        sb.append(", packingType=").append(packingType);
        sb.append(", fclNumber=").append(fclNumber);
        sb.append(", unitWeight=").append(unitWeight);
        sb.append(", additionNumber=").append(additionNumber);
        sb.append(", additionWeight1=").append(additionWeight1);
        sb.append(", additionWeight2=").append(additionWeight2);
        sb.append(", totalNumber=").append(totalNumber);
        sb.append(", totalWeight=").append(totalWeight);
        sb.append(", freightFee=").append(freightFee);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", operator=").append(operator);
        sb.append(", state=").append(state);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}