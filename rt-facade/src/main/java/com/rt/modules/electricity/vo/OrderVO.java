package com.rt.modules.electricity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.Converter;
import com.rt.modules.electricity.entity.Order;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-02-27 10:55
 * @desc 订单vo
 */
public class OrderVO implements Serializable {


    private static final long serialVersionUID = -3483894322201882206L;
    /**
     * id
     */
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 用户ID
     */
    private Long uid;

    /**
     * 如使用电子卡为电子ID
     */
    private Long eId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 商品编码
     */
    private String goodsCode;

    /**
     * 订单商品类型/ key笔记 / key周报/ 训练营课程
     */
    private Integer type;

    /**
     * 服务开始时间
     */
    @JsonFormat(pattern="yyyy/MM/dd",timezone="GMT+8")
    private LocalDate startDate;

    /**
     * 服务结束时间
     */
    @JsonFormat(pattern="yyyy/MM/dd",timezone="GMT+8")
    private LocalDate endDate;

    /**
     * 支付金额
     */
    private BigDecimal money;

    /**
     * 微信交易订单号
     */
    private String  transactionId;

    /**
     * 支付状态 0:未支付 1:支付中  2:支付成功   9支付失败
     */
    private Integer status;

    /**
     * 支付成功时间
     */
    @JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime payTime;

    /**
     * 订单创建时间
     */
    @JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createTime;

    /**
     * 订单修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除状态 0未删除 1已删除
     */
    private Integer deleteFlag;
    /**
     * 学院名称
     */
    private String collegeName;

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 课程名称，逗号分隔
     */
    private String courseNames;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 购买用户的学校ID
     */
    private Long schoolId;

    /**
     * 商品图片
     */
    private String goodsPic;

    /**
     * 商品名称
     */
    private String goodsName;


    /**
     * 微信用户的openId
     */
    private String openId;

    private String ip;



    /**
     * 判断是否过期
     */
    private Boolean pastDateFlag;

    /**
     * 电子卡卡密
     */
    private String cardPwd;

    /**
     * 电子卡卡密
     */
    private String ePwdCode;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(String courseNames) {
        this.courseNames = courseNames;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }


    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Boolean getPastDateFlag() {
        return pastDateFlag;
    }

    public void setPastDateFlag(Boolean pastDateFlag) {
        this.pastDateFlag = pastDateFlag;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    public String getePwdCode() {
        return ePwdCode;
    }

    public void setePwdCode(String ePwdCode) {
        this.ePwdCode = ePwdCode;
    }

    public OrderVO convertFor(Order o) {
        OrderVO.Convert convert = new OrderVO.Convert();
        OrderVO vo = convert.reverse().convert(o);
        return vo;
    }

    public Order convertTo() {
        OrderVO.Convert convert = new OrderVO.Convert();
        Order o = convert.convert(this);
        return o;
    }
    private static class Convert extends Converter<OrderVO, Order> {

        @Override
        protected Order doForward(OrderVO vo) {
            Order o = new Order();
            BeanUtils.copyProperties(vo, o);
            return o;
        }

        @Override
        protected OrderVO doBackward(Order o) {
            OrderVO vo = new OrderVO();
            BeanUtils.copyProperties(o, vo);
            return vo;
        }

    }
}
