package com.l0veyt.pw.common;

import com.l0veyt.pw.common.enums.CommonRespEnum;

/**
 * Created by xin.lee on 2017/10/9.
 * 公共配置控制器
 */
public class BaseController {

    protected <T> MessageResp<T> success() {
        return buildResp(null, CommonRespEnum.SUCCESS);
    }

    protected <T> MessageResp<T> success(T data) {
        return buildResp(data, CommonRespEnum.SUCCESS);
    }

    protected <T> MessageResp<T> fail() {
        return buildResp(null, CommonRespEnum.FAIL);
    }

    protected <T> MessageResp<T> fail(T data) {
        return buildResp(data, CommonRespEnum.FAIL);
    }

    private <T> MessageResp<T> buildResp(T data, CommonRespEnum commonRespEnum) {
        MessageResp<T> messageResp = MessageResp.of();
        messageResp.setData(data);
        messageResp.setCommonRespEnum(commonRespEnum);
        return messageResp;
    }
}