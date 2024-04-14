package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OmsOrderLoadingBucket implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单装载ID(关联)")
    private Long orderLoadingId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "桶位")
    private String bucketNo;

    @ApiModelProperty(value = "出口公司")
    private String exportCompany;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "操作人员")
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

    public Long getOrderLoadingId() {
        return orderLoadingId;
    }

    public void setOrderLoadingId(Long orderLoadingId) {
        this.orderLoadingId = orderLoadingId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBucketNo() {
        return bucketNo;
    }

    public void setBucketNo(String bucketNo) {
        this.bucketNo = bucketNo;
    }

    public String getExportCompany() {
        return exportCompany;
    }

    public void setExportCompany(String exportCompany) {
        this.exportCompany = exportCompany;
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
        sb.append(", orderLoadingId=").append(orderLoadingId);
        sb.append(", plateNumber=").append(plateNumber);
        sb.append(", bucketNo=").append(bucketNo);
        sb.append(", exportCompany=").append(exportCompany);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", operator=").append(operator);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}