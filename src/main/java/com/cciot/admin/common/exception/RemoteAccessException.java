package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:30
 * @company:mycom
 * @Description:
 */
public class RemoteAccessException extends CciotException {
    public RemoteAccessException() {
        super();
    }

    public RemoteAccessException(Object data) {
        super();
        super.data = data;
    }

    public RemoteAccessException(ResultCode resultCode) {
        super(resultCode);
    }

    public RemoteAccessException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public RemoteAccessException(String msg) {
        super(msg);
    }

    public RemoteAccessException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
