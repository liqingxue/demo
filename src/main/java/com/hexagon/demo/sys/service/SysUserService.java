package com.hexagon.demo.sys.service;

import com.github.pagehelper.PageInfo;
import com.hexagon.demo.sys.model.SysUser;

public interface SysUserService {

	Integer addUser(SysUser user);

	PageInfo<SysUser> findUserPage(int pageNum, int pageSize, SysUser user);
}
