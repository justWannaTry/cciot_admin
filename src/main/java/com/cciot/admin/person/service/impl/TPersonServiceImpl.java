package com.cciot.admin.person.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cciot.admin.person.entity.TPerson;
import com.cciot.admin.person.mapper.TPersonMapper;
import com.cciot.admin.person.service.TPersonService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yiqiang.zhang123
 * @since 2019-03-03
 */
@Service
public class TPersonServiceImpl extends ServiceImpl<TPersonMapper, TPerson> implements TPersonService {

}
