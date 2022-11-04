package cn.xj.mapper;

import cn.xj.pojo.Sc;
import cn.xj.pojo.ScExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScMapper {
    int countByExample(ScExample example);

    int deleteByExample(ScExample example);

    int deleteByPrimaryKey(String scid);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScExample example);

    Sc selectByPrimaryKey(String scid);

    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByExample(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
}