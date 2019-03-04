package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 10:55
 * @company:mycom
 * @Description:
 */
public class ParameterInvalidException extends CciotException {
    private static final long serialVersionUID = 3721036867889297081L;

    public ParameterInvalidException() {
        super();
    }

    public ParameterInvalidException(Object data) {
        super();
        super.data = data;
    }

    public ParameterInvalidException(ResultCode resultCode) {
        super(resultCode);
    }

    public ParameterInvalidException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public ParameterInvalidException(String msg) {
        super(msg);
    }

    public ParameterInvalidException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
