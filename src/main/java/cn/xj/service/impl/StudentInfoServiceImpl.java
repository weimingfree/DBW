package cn.xj.service.impl;

import cn.xj.mapper.StudentMapper;
import cn.xj.pojo.Student;
import cn.xj.pojo.StudentExample;
import cn.xj.service.StudentInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class StudentInfoServiceImpl implements StudentInfoService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public PageInfo splitPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        StudentExample example = new StudentExample();
        example.setOrderByClause("Sno desc");
        List<Student> list =studentMapper.selectByExample(example);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo splitPageBySelectID(int pageNum, int pageSize, String id) {
        PageHelper.startPage(pageNum,pageSize);
        StudentExample example = new StudentExample();
        example.createCriteria().andSnoEqualTo(id);
        List<Student> list = studentMapper.selectByExample(example);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int delete(String sid) {
        return studentMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int save(String sno, String sname,String Ssex,String Sage,String Sdept ) {
        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSsex(Ssex);
        student.setSage(Sage);
        student.setSdept(Sdept);
        return studentMapper.insert(student);
    }

    @Override
    public Student getByID(String sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int update(String sno, String sname,String Ssex,String Sage,String Sdept) {
        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSsex(Ssex);
        student.setSage(Sage);
        student.setSdept(Sdept);
        return studentMapper.updateByPrimaryKey(student);
    }
}
