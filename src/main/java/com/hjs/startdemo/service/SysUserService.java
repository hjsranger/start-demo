package com.hjs.startdemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hjs.startdemo.common.exception.ExceptionCast;
import com.hjs.startdemo.common.view.ResultCode;
import com.hjs.startdemo.entity.SysUser;
import com.hjs.startdemo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jianshuang_huang
 * @since 2020-04-10
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> queryList(){
        if(true){
            // int a = 1/0;
            ExceptionCast.cast(ResultCode.UNKNOWNERROR);
        }
        return sysUserMapper.selectList(new QueryWrapper<>());
    }

}
