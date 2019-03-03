package com.cciot.admin.common.exception;

import com.alibaba.druid.wall.violation.ErrorCode;
import lombok.Data;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 10:56
 * @company:mycom
 * @Description:
 */
@Data
public class CciotException extends Exception {
    private final String userErrMsg;
    private final ErrorCode errorCode;

    public CciotException(ErrorCode errorCode, String sysErrMsg, String userErrMsg) {
        super(sysErrMsg);
        this.userErrMsg = userErrMsg;
        this.errorCode = errorCode;
    }

    public CciotException(ErrorCode errorCode, String sysErrMsg, String userErrMsg, Throwable cause) {
        super(sysErrMsg, cause);
        this.userErrMsg = userErrMsg;
        this.errorCode = errorCode;
    }

    public CciotException(ErrorCode errorCode, String sysErrMsg) {
        super(sysErrMsg);
        this.userErrMsg = null;
        this.errorCode = errorCode;
    }
}
