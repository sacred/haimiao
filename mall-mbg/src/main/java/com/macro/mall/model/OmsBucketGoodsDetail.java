package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsBucketGoodsDetail implements Serializable {
    private Long id;

    @ApiModelProperty(value = "内地客户")
    private String localCust;

    @ApiModelProperty(value = "香港客户")
    private String hkCust;

    @ApiModelProperty(value = "订单装载ID(关联)")
    private Long orderLoadingId;

    @ApiModelProperty(value = "桶位ID(关联)")
    private Long bucketId;

    @ApiModelProperty(value = "客户订单")
    private Long custOrderId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

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

    @ApiModelProperty(value = "装货确认状态：0未确认，1已确认")
    private Integer loadingConfirmState;

    @ApiModelProperty(value = "装货确认人")
    private String loadingConfirmOperator;

    @ApiModelProperty(value = "装货确认时间")
    private Date loadingConfirmTime;

    @ApiModelProperty(value = "派货确认状态：0未确认，1已确认")
    private Integer sendingConfirmState;

    @ApiModelProperty(value = "派货确认人")
    private String sendingComfirmOperator;

    @ApiModelProperty(value = "派货确认时间")
    private Date sendingComfirmTime;

    @ApiModelProperty(value = "派货确认异常备注")
    private String sendingConfirmNotes;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "状态，见SYS_ENUM.ORDER_STATE")
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getOrderLoadingId() {
        return orderLoadingId;
    }

    public void setOrderLoadingId(Long orderLoadingId) {
        this.orderLoadingId = orderLoadingId;
    }

    public Long getBucketId() {
        return bucketId;
    }

    public void setBucketId(Long bucketId) {
        this.bucketId = bucketId;
    }

    public Long getCustOrderId() {
        return custOrderId;
    }

    public void setCustOrderId(Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
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

    public Integer getLoadingConfirmState() {
        return loadingConfirmState;
    }

    public void setLoadingConfirmState(Integer loadingConfirmState) {
        this.loadingConfirmState = loadingConfirmState;
    }

    public String getLoadingConfirmOperator() {
        return loadingConfirmOperator;
    }

    public void setLoadingConfirmOperator(String loadingConfirmOperator) {
        this.loadingConfirmOperator = loadingConfirmOperator;
    }

    public Date getLoadingConfirmTime() {
        return loadingConfirmTime;
    }

    public void setLoadingConfirmTime(Date loadingConfirmTime) {
        this.loadingConfirmTime = loadingConfirmTime;
    }

    public Integer getSendingConfirmState() {
        return sendingConfirmState;
    }

    public void setSendingConfirmState(Integer sendingConfirmState) {
        this.sendingConfirmState = sendingConfirmState;
    }

    public String getSendingComfirmOperator() {
        return sendingComfirmOperator;
    }

    public void setSendingComfirmOperator(String sendingComfirmOperator) {
        this.sendingComfirmOperator = sendingComfirmOperator;
    }

    public Date getSendingComfirmTime() {
        return sendingComfirmTime;
    }

    public void setSendingComfirmTime(Date sendingComfirmTime) {
        this.sendingComfirmTime = sendingComfirmTime;
    }

    public String getSendingConfirmNotes() {
        return sendingConfirmNotes;
    }

    public void setSendingConfirmNotes(String sendingConfirmNotes) {
        this.sendingConfirmNotes = sendingConfirmNotes;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", localCust=").append(localCust);
        sb.append(", hkCust=").append(hkCust);
        sb.append(", orderLoadingId=").append(orderLoadingId);
        sb.append(", bucketId=").append(bucketId);
        sb.append(", custOrderId=").append(custOrderId);
        sb.append(", plateNumber=").append(plateNumber);
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
        sb.append(", loadingConfirmState=").append(loadingConfirmState);
        sb.append(", loadingConfirmOperator=").append(loadingConfirmOperator);
        sb.append(", loadingConfirmTime=").append(loadingConfirmTime);
        sb.append(", sendingConfirmState=").append(sendingConfirmState);
        sb.append(", sendingComfirmOperator=").append(sendingComfirmOperator);
        sb.append(", sendingComfirmTime=").append(sendingComfirmTime);
        sb.append(", sendingConfirmNotes=").append(sendingConfirmNotes);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", operator=").append(operator);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}