package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:01
 * @company:mycom
 * @Description:
 */
public class UserNotLoginException extends CciotException {
    public UserNotLoginException() {
        super();
    }

    public UserNotLoginException(Object data) {
        super();
        super.data = data;
    }

    public UserNotLoginException(ResultCode resultCode) {
        super(resultCode);
    }

    public UserNotLoginException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public UserNotLoginException(String msg) {
        super(msg);
    }

    public UserNotLoginException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
