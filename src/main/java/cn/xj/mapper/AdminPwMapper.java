package cn.xj.mapper;

import cn.xj.pojo.AdminPw;
import cn.xj.pojo.AdminPwExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminPwMapper {
    int countByExample(AdminPwExample example);

    int deleteByExample(AdminPwExample example);

    int deleteByPrimaryKey(String aid);

    int insert(AdminPw record);

    int insertSelective(AdminPw record);

    List<AdminPw> selectByExample(AdminPwExample example);

    AdminPw selectByPrimaryKey(String aid);

    int updateByExampleSelective(@Param("record") AdminPw record, @Param("example") AdminPwExample example);

    int updateByExample(@Param("record") AdminPw record, @Param("example") AdminPwExample example);

    int updateByPrimaryKeySelective(AdminPw record);

    int updateByPrimaryKey(AdminPw record);
}