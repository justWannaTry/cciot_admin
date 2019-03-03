package com.cciot.admin.person.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yiqiang.zhang123
 * @since 2019-03-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TPerson extends Model<TPerson> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    private Integer type;
    private Integer orgId;
    private String name;
    private Integer sex;
    private Integer age;
    private Date birthday;
    private String idCardNumber;
    private String jobNumber;
    private String job;
    private String education;
    private String graduation;
    private String address;
    /**
     * 格式如：|13900000001|13900000002|
     */
    private String telephones;
    /**
     * 格式如：|123456@qq.com|654321@qq.com|
     */
    private String emails;
    /**
     * 仅用于老师，存放多个科目，关联科目表(Course)，格式为：|语文id|数学id|，如：|1|2|
     */
    private String courses;
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;
    private String loginName;
    private String loginPassword;
    private String lastLoginIp;
    private Date lastLoginDate;
    /**
     * 为空代表不过期
     */
    private Date validDate;
    private Integer actionGroupId;
    /**
     * 头像图片存放的相对路径
     */
    private String avatarPath;
    /**
     * 头像缩略图存放的相对路径
     */
    private String avatarPathSmall;
    /**
     * 容联云聊天账号ID
     */
    private String imAccountId;
    private Integer createUser;
    private Date createDate;
    private Integer modifyUser;
    private Date modifyDate;
    private Boolean isValid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
