package com.cciot.admin.common.menu.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cciot.admin.common.menu.entity.TMenu;
import com.cciot.admin.common.menu.entity.TMenuSearchVo;
import com.cciot.admin.common.menu.mapper.TMenuMapper;
import com.cciot.admin.common.menu.service.TMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yiqiang.zhang123
 * @since 2019-03-03
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class TMenuServiceImpl extends ServiceImpl<TMenuMapper, TMenu> implements TMenuService {

    /**
     * 保存
     *
     * @param tMenu
     * @return
     */
    @Override
    public Integer save(TMenu tMenu, Integer userId) {
        tMenu.setModifyUser(userId);
        tMenu.setCreateUser(userId);
        tMenu.setCreateDate(new Timestamp(System.currentTimeMillis()));
        tMenu.setModifyDate(new Timestamp(System.currentTimeMillis()));
        Integer integer = baseMapper.insertAllColumn(tMenu);
        log.info("新增菜单ID: " + tMenu.getId());
        return integer;
    }

    /**
     * 更新
     *
     * @param tMenu
     * @return
     */
    @Override
    public Integer update(TMenu tMenu, Integer userId) {
        tMenu.setModifyDate(new Timestamp(System.currentTimeMillis()));
        tMenu.setModifyUser(userId);
        return baseMapper.updateById(tMenu);
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteById(Long id) {
        return baseMapper.deleteById(id);
    }

    /**
     * 根据id批量删除
     *
     * @param ids
     * @return
     */
    @Override
    public Integer deleteByIds(List<Long> ids) {
        return baseMapper.deleteBatchIds(ids);
    }

    /**
     * 根据条件查询
     *
     * @param searchVo
     * @return
     */
    @Override
    public List<TMenu> findByConditions(TMenuSearchVo searchVo) {
        Page<TMenu> tMenuPage = new Page<>(searchVo.getPageNum(), searchVo.getPageSize());
        EntityWrapper<TMenu> tMenuEntityWrapper = new EntityWrapper<>();
        tMenuEntityWrapper.like("menu_name", searchVo.getMenuName());
        tMenuEntityWrapper.like("menu_code", searchVo.getMenuCode());
        return baseMapper.selectPage(tMenuPage, tMenuEntityWrapper);
    }

    /**
     * 根据上级获取菜单
     *
     * @param upMenuId
     * @return
     */
    @Override
    public List<TMenu> findByUpMenuId(Long upMenuId) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("up_menu_id", upMenuId);
        return baseMapper.selectByMap(stringObjectHashMap);
    }

    /**
     * 获取第一级菜单
     *
     * @return
     */
    @Override
    public List<TMenu> findLvOneList() {
        EntityWrapper<TMenu> tMenuEntityWrapper = new EntityWrapper<>();
        tMenuEntityWrapper.isNull("up_menu_id");
        List<TMenu> tMenus = baseMapper.selectList(tMenuEntityWrapper);
        return tMenus;
    }
}
