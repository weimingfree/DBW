package cn.xj.service;

import cn.xj.pojo.Course;
import com.github.pagehelper.PageInfo;

public interface CourseService {
    PageInfo splitPage(int pageNum, int pageSize);//根据页码进行跳转
    PageInfo splitPageBySelectID(int pageNum,int pageSize,String id);//根据id查询
    public int delete(String sid);
    public int save(String cno, String cname, String cpno, String ccredit);
    public Course getByID(String sid);
    public int update(String cno, String cname, String cpno, String ccredit);
}
