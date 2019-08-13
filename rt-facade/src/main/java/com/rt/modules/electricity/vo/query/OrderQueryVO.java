package com.rt.modules.electricity.vo.query;

/**
 * @author monkey_lwy@163.com
 * @date 2019-02-27 11:05
 * @desc
 */
public class OrderQueryVO {

    /**
     * 用户id
     */
    private Long uid;

    /**
     *电子卡id
     */
    private Long eId;
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 支付状态 0:未支付 1:支付中  2:支付成功   9支付失败
     */
    private Integer status;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long geteId() {
        return eId;
    }

    public void seteId(Long eId) {
        this.eId = eId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
