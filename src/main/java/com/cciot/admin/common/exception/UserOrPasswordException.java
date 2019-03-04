package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:44
 * @company:mycom
 * @Description:
 */
public class UserOrPasswordException extends CciotException {
    public UserOrPasswordException() {
        super();
    }

    public UserOrPasswordException(Object data) {
        super();
        super.data = data;
    }

    public UserOrPasswordException(ResultCode resultCode) {
        super(resultCode);
    }

    public UserOrPasswordException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public UserOrPasswordException(String msg) {
        super(msg);
    }

    public UserOrPasswordException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
