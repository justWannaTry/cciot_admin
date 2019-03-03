package com.cciot.admin.common.menu.controller;

import com.cciot.admin.common.menu.entity.TMenu;
import com.cciot.admin.common.menu.entity.TMenuSearchVo;
import com.cciot.admin.common.menu.service.TMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yiqiang.zhang123
 * @since 2019-03-03
 */
@RestController
@RequestMapping("/tMenu")
@Api("菜单设置")
public class TMenuController {
    @Autowired
    private TMenuService tMenuService;

    /**
     * 保存
     *
     * @param tMenu
     * @return
     */
    @PostMapping
    @ApiOperation("保存")
    public Integer save(TMenu tMenu, Integer usrId) {
        return tMenuService.save(tMenu, usrId);
    }

    /**
     * 更新
     *
     * @param tMenu
     * @return
     */
    @PutMapping("/update")
    @ApiOperation("/更新")
    public Integer update(TMenu tMenu, Integer userId) {
        return tMenuService.update(tMenu, userId);
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除")
    public Integer deleteById(@ApiParam(value = "id") @PathVariable Long id) {
        return tMenuService.deleteById(id);
    }

    /**
     * 根据id批量删除
     *
     * @param ids
     * @return
     */
    @DeleteMapping("/ids")
    @ApiOperation("根据id批量删除")
    public Integer deleteByIds(List<Long> ids) {
        return tMenuService.deleteByIds(ids);
    }

    /**
     * 根据条件查询
     *
     * @param searchVo
     * @return
     */
    @GetMapping("/search")
    @ApiOperation("根据条件查询")
    public List<TMenu> findByConditions(TMenuSearchVo searchVo) {
        return tMenuService.findByConditions(searchVo);
    }

    /**
     * 根据上级获取菜单
     *
     * @param upMenuId
     * @return
     */
    @GetMapping("/{upMenuId}")
    @ApiOperation("/根据上级获取菜单")
    public List<TMenu> findByUpMenuId(@ApiParam("上级菜单id") @PathVariable Long upMenuId) {
        return tMenuService.findByUpMenuId(upMenuId);
    }

    /**
     * 获取第一级菜单
     *
     * @return
     */
    @GetMapping("/list/lv1")
    @ApiOperation("获取第一级菜单")
    public List<TMenu> findLvOneList() {
        return tMenuService.findLvOneList();
    }

}

