package com.cciot.admin.device.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yiqiang.zhang
 * @since 2019-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_DeviceList")
public class TDevicelist extends Model<TDevicelist> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    /**
     * 设备名称
     */
    @TableField("Device_Name")
    private String deviceName;
    private Integer state;
    @TableField("Work_State")
    private Integer workState;
    private String sn;
    private String imei;
    private Integer orgId;
    @TableField("User_ID")
    private Integer userId;
    private Integer createUser;
    private Date createDate;
    private Integer modifyUser;
    private Date modifyDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
