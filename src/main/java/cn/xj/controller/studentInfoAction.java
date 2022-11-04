package cn.xj.controller;

import cn.xj.pojo.Student;
import cn.xj.service.StudentInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/studentInfo")
public class studentInfoAction {
    @Autowired
    StudentInfoService studentInfoService;
    public static final int PAGE_SIZE = 5;

    //分页，始终跳转到第一页的信息
    @RequestMapping("/split")
    public String split(HttpServletRequest request){
        PageInfo info = null;
        info =studentInfoService.splitPage(1,PAGE_SIZE);
        request.setAttribute("info",info);
        return "studentInfo";
    }
    //翻页使用
    @ResponseBody
    @RequestMapping("/ajaxSplit")
    public void ajaxSplit(int spage, HttpSession session){
        //取得当前page参数的页面的数据
        PageInfo info = studentInfoService.splitPage(spage,PAGE_SIZE);
        session.setAttribute("info",info);
    }

    //查询
    @ResponseBody
    @RequestMapping("/condition")
    public void conditionSplit(String sid,HttpSession session){
        PageInfo info = null;
        info = studentInfoService.splitPageBySelectID(1,PAGE_SIZE,sid);
        session.setAttribute("info",info);
    }
    //删除
    @RequestMapping("/delete")
    public String delete(String sid,HttpServletRequest request){
        int num = -1;
        try {
            num = studentInfoService.delete(sid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num  > 0 ){
            request.setAttribute("msg","删除成功");
        }else{
            request.setAttribute("msg","删除失败");
        }
        //删除结束后跳到分页显示
        return "forward:/studentInfo/split.action";
    }

    //更新
    //点击编辑按钮时
    @RequestMapping("/one")
    public String one(String sid, Model model){
        Student info = studentInfoService.getByID(sid);
        model.addAttribute("thisstudent",info);
        return"updateStudentInfo";
    }
    @RequestMapping("/update")
    public String update(String sid,String sname,String ssex,String sage,String sdept,HttpServletRequest request){
        int num = -1;
        try {
            num = studentInfoService.update(sid ,sname,ssex,sage,sdept);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num > 0) {
            //此时说明更新成功
            request.setAttribute("msg","更新成功!");
        }else{
            request.setAttribute("msg","更新失败!");
        }
        return "forward:/studentInfo/split.action";

    }
    //保存
    @RequestMapping("/save")
    public String save(String sid,String sname,String ssex,String sage,String sdept,HttpServletRequest request){
        System.out.println(sid + " " + sname + " " + ssex + " " + sage + " " + sdept);
        int num = -1;
        try {
            num = studentInfoService.save(sid,sname,ssex,sage,sdept);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num > 0){
            request.setAttribute("msg","增加成功！");
        }else {
            request.setAttribute("msg","增加失败！");
        }
        return "forward:/studentInfo/split.action";
    }

}
