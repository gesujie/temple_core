/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.mappers;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public abstract interface BaseMapper<Example, E>{
  public abstract int countByExample(Example paramExample);

  public abstract int deleteByExample(Example paramExample);

  public abstract int deleteByPrimaryKey(Long paramLong);

  public abstract int insert(E paramE);

  public abstract int insertSelective(E paramE);

  public abstract List<E> selectByExample(Example paramExample);

  public abstract E selectByPrimaryKey(Long paramLong);

  public abstract int updateByExampleSelective(@Param("record") E paramE, @Param("example") Example paramExample);

  public abstract int updateByExample(@Param("record") E paramE, @Param("example") Example paramExample);

  public abstract int updateByPrimaryKeySelective(E paramE);

  public abstract int updateByPrimaryKey(E paramE);
}