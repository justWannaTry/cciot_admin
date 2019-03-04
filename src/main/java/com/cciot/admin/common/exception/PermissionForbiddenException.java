package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:04
 * @company:mycom
 * @Description:
 */
public class PermissionForbiddenException extends CciotException {

    public PermissionForbiddenException() {
        super();
    }

    public PermissionForbiddenException(Object data) {
        super();
        super.data = data;
    }

    public PermissionForbiddenException(ResultCode resultCode) {
        super(resultCode);
    }

    public PermissionForbiddenException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public PermissionForbiddenException(String msg) {
        super(msg);
    }

    public PermissionForbiddenException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
