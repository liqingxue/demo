package com.hexagon.demo.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hexagon.demo.sys.mapper.SysUserMapper;
import com.hexagon.demo.sys.model.SysUser;
import com.hexagon.demo.sys.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper userMapper;

	@Override
	public Integer addUser(SysUser user) {
		return userMapper.insert(user);
	}

	@Override
	public PageInfo<SysUser> findUserPage(int pageNum, int pageSize, SysUser user) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysUser> userList = userMapper.selectAll();
		PageInfo<SysUser> result = new PageInfo<>(userList);
		return result;
	}

}
