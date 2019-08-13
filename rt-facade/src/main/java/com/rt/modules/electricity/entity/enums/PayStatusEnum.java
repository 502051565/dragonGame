package com.rt.modules.electricity.entity.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @ClassName:  PayStatusEnum
 * @Description:   订单支付状态
 * @author:  <a href="liuyafengwy@163.com">luffy</a>
 * @date:  2019/2/24 15:09
 */
public enum PayStatusEnum implements IEnum<Integer> {

    PAY_NOT(0, "未支付"),
    PAY_IN(1, "支付中"),
    PAY_SUCCESS(2, "支付成功"),
    PAY_FAIL(9, "支付失败");

    private Integer value;
    private String desc;

    PayStatusEnum(final Integer value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
