package com.cciot.admin.device.controller;

import com.cciot.admin.device.entity.TDevicelist;
import com.cciot.admin.device.entity.TDevicelistSearchVo;
import com.cciot.admin.device.entity.TDevicelistVo;
import com.cciot.admin.device.service.TDevicelistService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yiqiang.zhang
 * @since 2019-03-02
 */
@RestController
@RequestMapping("/t-device-lists")
@Api(description = "设备信息")
public class TDevicelistController {
    @Autowired
    private TDevicelistService tDevicelistService;
    @GetMapping("/page")
    public List<TDevicelist> findPage(TDevicelistSearchVo searchVo){
        return tDevicelistService.findByConDitions(searchVo);
    }

    @GetMapping("/{id}")
    public TDevicelist findById(@PathVariable Long id){
        TDevicelist tDevicelist = tDevicelistService.selectById(id);
        return tDevicelist;
    }
}

