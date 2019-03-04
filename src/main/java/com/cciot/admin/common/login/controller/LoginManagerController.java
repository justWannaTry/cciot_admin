package com.cciot.admin.common.login.controller;

import com.cciot.admin.common.exception.DataNotFoundException;
import com.cciot.admin.common.login.entity.LoginBack;
import com.cciot.admin.common.login.entity.LoginInfo;
import com.cciot.admin.common.login.service.LoginManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 10:54
 * @company:mycom
 * @Description:
 */
@RestController
@RequestMapping("/login")
@Api(description = "用户登入注册模块")
public class LoginManagerController {
    @Autowired
    private LoginManagerService loginManagerService;

    @PostMapping
    @ApiOperation("登入")
    public LoginBack checkPersonLogin(LoginInfo loginInfo) throws Exception {
        return loginManagerService.checkPersonLogin(loginInfo);
    }

}
