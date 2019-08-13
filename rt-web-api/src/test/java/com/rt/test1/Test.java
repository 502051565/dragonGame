package com.rt.test1;

import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.rt.common.utils.AESUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Test {

    @org.junit.Test
    public void test1(){
        BigDecimal money = new BigDecimal("1112320.254555");
        System.out.println(money.toString());
        System.out.println(money.toEngineeringString());
        System.out.println(money.toPlainString());

        System.out.println(BaseWxPayRequest.yuanToFen(money.toString()));
    }

    @org.junit.Test
    public void test2(){
        // 根据年月日取日期：
        LocalDate date = LocalDate.of(1970, 01, 02); // -> 2014-12-25
        System.out.println(date.toEpochDay());

        // 根据年月日取日期：
        LocalDate date1 = LocalDate.of(1970, 01, 01); // -> 2014-12-25
        System.out.println(date1.toEpochDay());

        System.out.println(date1.toEpochDay() - date.toEpochDay());


    }

}
