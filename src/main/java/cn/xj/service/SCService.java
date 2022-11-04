package cn.xj.service;

import cn.xj.pojo.Sc;
import cn.xj.pojo.Student;
import com.github.pagehelper.PageInfo;

public interface SCService {
    PageInfo splitPage(int pageNum, int pageSize);//根据页码进行跳转
    PageInfo splitPageBySelectID(int pageNum,int pageSize,String id);//根据id查询
    PageInfo splitPageBySelectSno(int pageNum,int pageSize,String sno);
    PageInfo splitPageBySelectCno(int pageNum,int pageSize,String cno);
    public int delete(String sid);
    public int save(String scid,String sno, String cno,String grade);
    public Sc getByID(String sid);
    public int update(String scid,String sno, String cno,String grade);
}
