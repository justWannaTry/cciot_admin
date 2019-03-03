package com.cciot.admin.org.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
public class TOrg extends Model<TOrg> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    private Integer type;
    private String name;
    private String orgDesc;
    private String address;
    private String postcode;
    private String telephone;
    private String fax;
    private String email;
    private String url;
    private String contact;
    private Integer bindClassId;
    private String createUser;
    private Date createDate;
    private String modifyUser;
    private Date modifyDate;
    private Integer isValid;
    private String data5;
    private String data4;
    private String data3;
    private String data1;
    private String data2;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
