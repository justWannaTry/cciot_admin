package com.cciot.admin.common.exception;

import lombok.Data;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:14
 * @company:mycom
 * @Description:
 */
public enum ResultCode {
    PARAM_IS_INVALID("123", "参数不正确"),
    RESULE_DATA_NONE("123", "参数不正确"),
    DATA_ALREADY_EXISTED("123", "参数不正确"),
    USER_NOT_LOGGED_IN("123", "参数不正确"),
    PERMISSION_NO_ACCESS("123", "参数不正确"),
    INTERFACE_OUTTER_INVOKE_ERROR("123", "参数不正确"),
    SYSTEM_INNER_ERROR("123", "参数不正确"),
    USER_PASSWORD_ERROR("4442", "账号或密码错误");
    private String code;
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
