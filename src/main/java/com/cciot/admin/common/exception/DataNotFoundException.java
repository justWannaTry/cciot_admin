package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 10:55
 * @company:mycom
 * @Description:
 */
public class DataNotFoundException extends CciotException{
    public DataNotFoundException() {
        super();
    }

    public DataNotFoundException(Object data) {
        super();
        super.data = data;
    }

    public DataNotFoundException(ResultCode resultCode) {
        super(resultCode);
    }

    public DataNotFoundException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public DataNotFoundException(String msg) {
        super(msg);
    }

    public DataNotFoundException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
