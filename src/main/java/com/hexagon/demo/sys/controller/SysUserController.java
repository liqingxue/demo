package com.hexagon.demo.sys.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexagon.demo.sys.model.SysUser;
import com.hexagon.demo.sys.service.SysUserService;

@RestController
@RequestMapping(value = "/user")
public class SysUserController {

	@Autowired
	private SysUserService userService;

	@PostMapping(value = "/add")
	public int addUser(SysUser user) {
		return userService.addUser(user);
	}

	@GetMapping(value = "/list")
	public Object findUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize, SysUser user) {
		System.out.println("++++++进入了list方法,pageNum:" + pageNum);
		return userService.findUserPage(pageNum, pageSize, user);
	}

	@PostMapping(value = "/login")
	public String login(@RequestParam(name = "userName") String userName,
			@RequestParam(name = "password") String password) {
		System.out.println(userName + " ========== " + password);
		return "super_admin";
	}

	@GetMapping(value = "/getUserInfo")
	public Object getUserInfo(@RequestParam(name = "token") String token) {
		System.out.println("=============token:" + token);
		Map<String, Object> infoMap = new HashMap<String, Object>();
		infoMap.put("name", "super_admin");
		infoMap.put("user_id", 1);
		infoMap.put("access", new String[] { "super_admin", "admin" });
		infoMap.put("token", token);
		infoMap.put("avator", "https://file.iviewui.com/dist/a0e88e83800f138b94d2414621bd9704.png");
		return infoMap;
	}
}
