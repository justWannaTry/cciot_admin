package com.cciot.admin.common.menu.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;

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
public class TMenu extends Model<TMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单编码
     */
    private String menuCode;
    /**
     * 上级菜单id
     */
    private Integer upMenuId;
    /**
     * 创建者
     */
    private Integer createUser;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 修改人
     */
    private Integer modifyUser;
    /**
     * 修改日期
     */
    private Date modifyDate;
    /**
     * 菜单URL
     */
    private String menuUrl;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
