package com.cciot.admin.common.login.service.impl;

import com.cciot.admin.common.exception.CciotException;
import com.cciot.admin.common.exception.DataNotFoundException;
import com.cciot.admin.common.exception.ExceptionEnum;
import com.cciot.admin.common.exception.UserOrPasswordException;
import com.cciot.admin.common.login.entity.LoginBack;
import com.cciot.admin.common.login.entity.LoginInfo;
import com.cciot.admin.common.login.service.LoginManagerService;
import com.cciot.admin.org.entity.TOrg;
import com.cciot.admin.org.service.TOrgService;
import com.cciot.admin.person.entity.TPerson;
import com.cciot.admin.person.service.TPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 11:02
 * @company:mycom
 * @Description:
 */
@Service
public class LoginManagerServiceImpl implements LoginManagerService {
    @Autowired
    private TPersonService tPersonService;
    @Autowired
    private TOrgService tOrgService;

    /**
     * 校验用户是否合法
     *
     * @param loginInfo
     * @return
     * @date 2019-03-03
     * @author yiqiang.zhang
     */
    @Override
    public LoginBack checkPersonLogin(LoginInfo loginInfo) throws Exception {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("login_name", loginInfo.getUsername());
        stringObjectHashMap.put("login_password", loginInfo.getUserPassword());

        List<TPerson> tPeople = tPersonService.selectByMap(stringObjectHashMap);

        if (tPeople != null && tPeople.size() == 1) {
            LoginBack loginBack = new LoginBack();
            TPerson tPerson = tPeople.get(0);
            Integer orgId = tPerson.getOrgId();
            loginBack.setTPerson(tPerson);
            if (orgId != null) {
                TOrg tOrg = tOrgService.selectById(orgId);
                loginBack.setTOrg(tOrg);
            }
            return loginBack;
        } else {
            throw new UserOrPasswordException(ExceptionEnum.USER_PASSWORD_ERROR);
        }
    }
}
