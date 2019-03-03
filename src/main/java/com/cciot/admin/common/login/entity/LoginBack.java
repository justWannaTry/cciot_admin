package com.cciot.admin.common.login.entity;

import com.cciot.admin.org.entity.TOrg;
import com.cciot.admin.person.entity.TPerson;
import lombok.Data;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 11:40
 * @company:mycom
 * @Description:
 */
@Data
public class LoginBack {
    private TPerson tPerson;
    private TOrg tOrg;
}
