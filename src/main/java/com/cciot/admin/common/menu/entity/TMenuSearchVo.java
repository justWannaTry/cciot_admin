package com.cciot.admin.common.menu.entity;

import com.cciot.admin.common.PageBean;
import lombok.Data;

/**
 * @author:yiqiang.zhang
 * @createTime:2019/3/3 13:26
 * @company:mycom
 * @Description:
 */
@Data
public class TMenuSearchVo extends PageBean {
    private String menuName;
    private String menuCode;
}
