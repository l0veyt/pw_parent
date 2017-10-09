package com.l0veyt.pw.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by xin.lee on 2017/10/9.
 * 通用响应枚举类
 */
public enum CommonRespEnum {

    SUCCESS("100200", "成功"),
    FAIL("101400", "服务异常");

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private String msg;

    @SuppressWarnings("unused")
    CommonRespEnum(String code, String msg) {}
}