package net.sunnada.base.mapper;

import net.sunnada.base.pojo.TbLabel;
import net.sunnada.base.pojo.TbLabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLabelMapper {
    int countByExample(TbLabelExample example);

    int deleteByExample(TbLabelExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbLabel record);

    int insertSelective(TbLabel record);

    List<TbLabel> selectByExample(TbLabelExample example);

    TbLabel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbLabel record, @Param("example") TbLabelExample example);

    int updateByExample(@Param("record") TbLabel record, @Param("example") TbLabelExample example);

    int updateByPrimaryKeySelective(TbLabel record);

    int updateByPrimaryKey(TbLabel record);
}