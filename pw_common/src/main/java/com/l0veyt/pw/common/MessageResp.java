package com.l0veyt.pw.common;

import com.l0veyt.pw.common.enums.CommonRespEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by xin.lee on 2017/10/9.
 * 响应JSON数据的封装类
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class MessageResp<T> {

    /** 响应数据 */
    private T data;

    /** 响应编码 */
    private String code = "100200";

    /** 响应消息 */
    private String msg = "";

    void setCommonRespEnum(CommonRespEnum commonRespEnum) {
        this.code = commonRespEnum.getCode();
        this.msg = commonRespEnum.getMsg();
    }
}