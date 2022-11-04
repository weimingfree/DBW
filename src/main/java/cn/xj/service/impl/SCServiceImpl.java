package cn.xj.service.impl;

import cn.xj.mapper.ScMapper;
import cn.xj.pojo.Sc;
import cn.xj.pojo.ScExample;
import cn.xj.pojo.Student;
import cn.xj.pojo.StudentExample;
import cn.xj.service.SCService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SCServiceImpl implements SCService {
    @Autowired
    ScMapper scMapper;

    @Override
    public PageInfo splitPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        ScExample example = new ScExample();
        example.setOrderByClause("Scid desc");
        List<Sc> list =scMapper.selectByExample(example);
        PageInfo<Sc> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo splitPageBySelectID(int pageNum, int pageSize, String id) {
        PageHelper.startPage(pageNum,pageSize);
        ScExample example = new ScExample();
        example.createCriteria().andScidEqualTo(id);
        List<Sc> list =scMapper.selectByExample(example);
        PageInfo<Sc> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @Override
    public PageInfo splitPageBySelectSno(int pageNum, int pageSize, String sno) {
        PageHelper.startPage(pageNum,pageSize);
        ScExample example = new ScExample();
        example.createCriteria().andSnoEqualTo(sno);
        List<Sc> list =scMapper.selectByExample(example);
        PageInfo<Sc> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @Override
    public PageInfo splitPageBySelectCno(int pageNum, int pageSize, String cno) {
        PageHelper.startPage(pageNum,pageSize);
        ScExample example = new ScExample();
        example.createCriteria().andCnoEqualTo(cno);
        List<Sc> list =scMapper.selectByExample(example);
        PageInfo<Sc> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int delete(String sid) {

        return scMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int save(String scid,String sno, String cno, String grade) {

        Sc sc = new Sc();
        sc.setSno(sno);
        sc.setCno(cno);
        sc.setScid(scid);
        sc.setGrade(grade);
        return scMapper.insert(sc);
    }

    @Override
    public Sc getByID(String sid) {

        return scMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int update(String scid,String sno, String cno, String grade) {

        Sc sc = new Sc();
        sc.setSno(sno);
        sc.setCno(cno);
        sc.setScid(scid);
        sc.setGrade(grade);
        return scMapper.updateByPrimaryKey(sc);
    }
}
