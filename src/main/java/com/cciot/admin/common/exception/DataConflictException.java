package com.cciot.admin.common.exception;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/4 11:00
 * @company:mycom
 * @Description:
 */
public class DataConflictException extends CciotException{
    public DataConflictException() {
        super();
    }

    public DataConflictException(Object data) {
        super();
        super.data = data;
    }

    public DataConflictException(ResultCode resultCode) {
        super(resultCode);
    }

    public DataConflictException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public DataConflictException(String msg) {
        super(msg);
    }

    public DataConflictException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
    
}
