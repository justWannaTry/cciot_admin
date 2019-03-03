package com.cciot.admin.device.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.cciot.admin.device.entity.TDevicelist;
import com.cciot.admin.device.entity.TDevicelistSearchVo;
import com.cciot.admin.device.entity.TDevicelistVo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yiqiang.zhang
 * @since 2019-03-02
 */
public interface TDevicelistService extends IService<TDevicelist> {

    List<TDevicelist> findByConDitions(TDevicelistSearchVo searchVo);

}
