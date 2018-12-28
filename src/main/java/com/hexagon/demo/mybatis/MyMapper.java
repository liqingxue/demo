package com.hexagon.demo.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.SqlServerMapper;

public interface MyMapper<T> extends Mapper<T>, SqlServerMapper<T> {
	// TODO
	// FIXME 特别注意，该接口不能被扫描到，否则会出错
}
