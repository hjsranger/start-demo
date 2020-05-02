package com.hjs.startdemo.controller;


import com.hjs.startdemo.common.BaseController;
import com.hjs.startdemo.common.view.JsonResult;
import com.hjs.startdemo.entity.SysUser;
import com.hjs.startdemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jianshuang_huang
 * @since 2020-04-10
 */
@RestController
@RequestMapping("/api/sys/user")
public class SysUserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/query")
    public JsonResult query() {
        List<SysUser> list = sysUserService.queryList();
        return wrapperJsonResult(list);
    }

}
