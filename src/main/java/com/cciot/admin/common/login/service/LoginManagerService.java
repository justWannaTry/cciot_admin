package com.cciot.admin.common.login.service;

import com.cciot.admin.common.login.entity.LoginBack;
import com.cciot.admin.common.login.entity.LoginInfo;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 10:55
 * @company:mycom
 * @Description:
 */
public interface LoginManagerService {
    /**
     * 校验用户是否合法
     * @date 2019-03-03
     * @author yiqiang.zhang
     * @param loginInfo
     * @return
     */
    LoginBack checkPersonLogin(LoginInfo loginInfo);
}
