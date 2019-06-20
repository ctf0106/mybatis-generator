package com.tengfei.data.mapper;

import com.tengfei.data.model.Links;
import com.tengfei.data.model.LinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinksMapper {
    long countByExample(LinksExample example);

    int deleteByExample(LinksExample example);

    int deleteByPrimaryKey(Integer linksId);

    int insert(Links record);

    int insertSelective(Links record);

    List<Links> selectByExample(LinksExample example);

    Links selectByPrimaryKey(Integer linksId);

    int updateByExampleSelective(@Param("record") Links record, @Param("example") LinksExample example);

    int updateByExample(@Param("record") Links record, @Param("example") LinksExample example);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}