package cn.xj.controller;

import cn.xj.pojo.Course;
import cn.xj.pojo.Student;
import cn.xj.service.CourseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/courseInfo")
public class CourseInfoAction {
    @Autowired
    CourseService courseService;
    public static final int PAGE_SIZE = 5;
    //分页，始终跳转到第一页的信息
    @RequestMapping("/split")
    public String split(HttpServletRequest request){
        PageInfo info = null;
        info =courseService.splitPage(1,PAGE_SIZE);
        request.setAttribute("info",info);
        return "courseInfo";
    }
    //翻页使用
    @ResponseBody
    @RequestMapping("/ajaxSplit")
    public void ajaxSplit(int spage, HttpSession session){
        //取得当前page参数的页面的数据
        PageInfo info = courseService.splitPage(spage,PAGE_SIZE);
        session.setAttribute("info",info);
    }

    //查询
    @ResponseBody
    @RequestMapping("/condition")
    public void conditionSplit(String sid,HttpSession session){
        PageInfo info = null;
        info = courseService.splitPageBySelectID(1,PAGE_SIZE,sid);
        session.setAttribute("info",info);
    }
    //删除
    @RequestMapping("/delete")
    public String delete(String sid,HttpServletRequest request){
        int num = -1;
        try {
            num = courseService.delete(sid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num  > 0 ){
            request.setAttribute("msg","删除成功");
        }else{
            request.setAttribute("msg","删除失败");
        }
        //删除结束后跳到分页显示
        return "forward:/courseInfo/split.action";
    }

    //更新
    //点击编辑按钮时
    @RequestMapping("/one")
    public String one(String sid, Model model){
        Course info = courseService.getByID(sid);
        model.addAttribute("thiscourse",info);
        return"updateCourseInfo";
    }
    @RequestMapping("/update")
    public String update(String cno,String cname,String cpno,String ccredit,HttpServletRequest request){
        int num = -1;
        try {
            num = courseService.update(cno ,cname,cpno,ccredit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num > 0) {
            //此时说明更新成功
            request.setAttribute("msg","更新成功!");
        }else{
            request.setAttribute("msg","更新失败!");
        }
        return "forward:/courseInfo/split.action";

    }
    //保存
    @RequestMapping("/save")
    public String save(String cno,String cname,String cpno,String ccredit,HttpServletRequest request){

        int num = -1;
        try {
            num = courseService.save(cno,cname,cpno,ccredit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num > 0){
            request.setAttribute("msg","增加成功！");
        }else {
            request.setAttribute("msg","增加失败！");
        }
        return "forward:/courseInfo/split.action";
    }
}
