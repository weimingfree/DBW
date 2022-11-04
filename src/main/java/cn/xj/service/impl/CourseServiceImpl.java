package cn.xj.service.impl;

import cn.xj.mapper.CourseMapper;
import cn.xj.pojo.Course;
import cn.xj.pojo.CourseExample;
import cn.xj.pojo.Student;
import cn.xj.pojo.StudentExample;
import cn.xj.service.CourseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;
    @Override
    public PageInfo splitPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        CourseExample example = new CourseExample();
        example.setOrderByClause("Cno desc");
        List<Course> list =courseMapper.selectByExample(example);
        PageInfo<Course> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo splitPageBySelectID(int pageNum, int pageSize, String id) {
        PageHelper.startPage(pageNum,pageSize);
        CourseExample example = new CourseExample();
        example.createCriteria().andCnoEqualTo(id);
        List<Course> list = courseMapper.selectByExample(example);
        PageInfo<Course> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int delete(String sid) {
        return courseMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int save(String cno, String cname, String cpno, String ccredit) {
        Course course = new Course();
        course.setCno(cno);
        course.setCname(cname);
        course.setCpno(cpno);
        course.setCcredit(ccredit);
        return courseMapper.insert(course);
    }

    @Override
    public Course getByID(String sid) {
        return courseMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int update(String cno, String cname, String cpno, String ccredit) {
        Course course = new Course();
        course.setCno(cno);
        course.setCname(cname);
        course.setCpno(cpno);
        course.setCcredit(ccredit);
        return courseMapper.updateByPrimaryKey(course);
    }
}
