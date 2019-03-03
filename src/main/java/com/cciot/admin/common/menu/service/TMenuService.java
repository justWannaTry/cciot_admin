package com.cciot.admin.common.menu.service;

import com.baomidou.mybatisplus.service.IService;
import com.cciot.admin.common.menu.entity.TMenu;
import com.cciot.admin.common.menu.entity.TMenuSearchVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yiqiang.zhang123
 * @since 2019-03-03
 */
public interface TMenuService extends IService<TMenu> {
    /**
     * 保存
     * @param tMenu
     * @return
     */
    Integer save(TMenu tMenu,Integer userId);

    /**
     * 更新
     * @param tMenu
     * @return
     */
    Integer update(TMenu tMenu,Integer userId);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    Integer deleteByIds(List<Long> ids);

    /**
     * 根据条件查询
     * @param searchVo
     * @return
     */
    List<TMenu> findByConditions(TMenuSearchVo searchVo);

    /**
     * 根据上级获取菜单
     * @param upMenuId
     * @return
     */
    List<TMenu> findByUpMenuId(Long upMenuId);

    /**
     * 获取第一级菜单
     * @return
     */
    List<TMenu> findLvOneList();
}
