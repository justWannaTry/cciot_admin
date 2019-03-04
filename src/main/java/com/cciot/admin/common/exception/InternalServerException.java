package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:09
 * @company:mycom
 * @Description:
 */
public class InternalServerException extends CciotException{
    public InternalServerException() {
        super();
    }

    public InternalServerException(Object data) {
        super();
        super.data = data;
    }

    public InternalServerException(ResultCode resultCode) {
        super(resultCode);
    }

    public InternalServerException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public InternalServerException(String msg) {
        super(msg);
    }

    public InternalServerException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
