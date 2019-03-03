package com.cciot.admin.device.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cciot.admin.device.entity.TDevicelist;
import com.cciot.admin.device.entity.TDevicelistSearchVo;
import com.cciot.admin.device.entity.TDevicelistVo;
import com.cciot.admin.device.mapper.TDevicelistMapper;
import com.cciot.admin.device.service.TDevicelistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yiqiang.zhang
 * @since 2019-03-02
 */
@Service
public class TDevicelistServiceImpl extends ServiceImpl<TDevicelistMapper, TDevicelist> implements TDevicelistService {
    @Resource
    private TDevicelistMapper tDevicelistMapper;
    @Override
    public List<TDevicelist> findByConDitions(TDevicelistSearchVo searchVo) {
        Page<TDevicelistVo> tDevicelistVoPage = new Page<>(searchVo.getPageNum(), searchVo.getPageSize());
        TDevicelist tDevicelistVo = new TDevicelist();
        EntityWrapper<TDevicelist> tDevicelistVoEntityWrapper = new EntityWrapper<>(tDevicelistVo);
        List<TDevicelist> tDevicelistVos = baseMapper.selectPage(tDevicelistVoPage,tDevicelistVoEntityWrapper);
        return tDevicelistVos;
    }
}
