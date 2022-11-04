package cn.xj.service;

import cn.xj.pojo.Student;
import com.github.pagehelper.PageInfo;

public interface StudentInfoService {
    PageInfo splitPage(int pageNum, int pageSize);//根据页码进行跳转
    PageInfo splitPageBySelectID(int pageNum,int pageSize,String id);//根据id查询
    public int delete(String sid);
    public int save(String sno, String sname,String Ssex,String Sage,String Sdept);
    public Student getByID(String sid);
    public int update(String sno, String sname,String Ssex,String Sage,String Sdept);
}
