package com.cciot.admin.device.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cciot.admin.device.entity.TDevicelist;
import com.cciot.admin.device.entity.TDevicelistVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yiqiang.zhang
 * @since 2019-03-02
 */
@Mapper
public interface TDevicelistMapper extends BaseMapper<TDevicelist> {

}
