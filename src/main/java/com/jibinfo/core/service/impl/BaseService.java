/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.service.impl;

import java.util.List;

import com.jibinfo.core.mappers.BaseMapper;
import com.jibinfo.core.service.IBaseService;

public abstract class BaseService<Example, E> implements IBaseService<Example, E>{
	  protected BaseMapper<Example, E> mapper;

	  public int countByExample(Example example)
	  {
	    return getMapper().countByExample(example);
	  }

	  public int deleteByExample(Example example) {
	    return getMapper().deleteByExample(example);
	  }

	  public int deleteByPrimaryKey(Long id) {
	    return getMapper().deleteByPrimaryKey(id);
	  }

	  public int insert(E record) {
	    return getMapper().insert(record);
	  }

	  public int insertSelective(E record) {
	    return getMapper().insertSelective(record);
	  }

	  public List<E> selectByExample(Example example) {
	    return getMapper().selectByExample(example);
	  }

	  public E selectByPrimaryKey(Long id) {
	    return getMapper().selectByPrimaryKey(id);
	  }

	  public int updateByExampleSelective(E record, Example example) {
	    return getMapper().updateByExampleSelective(record, example);
	  }

	  public int updateByExample(E record, Example example) {
	    return getMapper().updateByExample(record, example);
	  }

	  public int updateByPrimaryKeySelective(E record) {
	    return getMapper().updateByPrimaryKeySelective(record);
	  }

	  public int updateByPrimaryKey(E record) {
	    return getMapper().updateByPrimaryKey(record);
	  }

	  public abstract BaseMapper<Example, E> getMapper();
}
