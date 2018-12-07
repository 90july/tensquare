package net.sunnada.base.mapper;

import net.sunnada.base.pojo.TbCity;
import net.sunnada.base.pojo.TbCityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCityMapper {
    int countByExample(TbCityExample example);

    int deleteByExample(TbCityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbCity record);

    int insertSelective(TbCity record);

    List<TbCity> selectByExample(TbCityExample example);

    TbCity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCity record, @Param("example") TbCityExample example);

    int updateByExample(@Param("record") TbCity record, @Param("example") TbCityExample example);

    int updateByPrimaryKeySelective(TbCity record);

    int updateByPrimaryKey(TbCity record);
}