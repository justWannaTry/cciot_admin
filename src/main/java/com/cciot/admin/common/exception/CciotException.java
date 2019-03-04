package com.cciot.admin.common.exception;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 10:56
 * @company:mycom
 * @Description:
 */
@Data
public class CciotException extends Exception {
    private static final long serialVersionUID = 194906846739586856L;

    protected String code;

    protected String message;

    protected ResultCode resultCode;

    protected Object data;

    public CciotException() {
        ExceptionEnum exceptionEnum = ExceptionEnum.getByEClass(this.getClass());
        if (exceptionEnum != null) {
            resultCode = exceptionEnum.getResultCode();
            code = exceptionEnum.getResultCode().getCode().toString();
            message = exceptionEnum.getResultCode().getMessage();
        }

    }

    public CciotException(String message) {
        this();
        this.message = message;
    }

    public CciotException(String format, Object... objects) {
        this();
        format = StringUtils.replace(format, "{}", "%s");
        this.message = String.format(format, objects);
    }

    public CciotException(String msg, Throwable cause, Object... objects) {
        this();
        String format = StringUtils.replace(msg, "{}", "%s");
        this.message= String.format(format, objects);
    }

    public CciotException(ResultCode resultCode, Object data) {
        this(resultCode);
        this.data = data;
    }

    public CciotException(ResultCode resultCode) {
        this.resultCode = resultCode;
        this.code = resultCode.getCode().toString();
        this.message = resultCode.getMessage();
    }
}
