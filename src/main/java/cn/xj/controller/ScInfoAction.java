package cn.xj.controller;

import cn.xj.pojo.Course;
import cn.xj.pojo.Sc;
import cn.xj.service.SCService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/scInfo")
public class ScInfoAction {
    @Autowired
    SCService scService;
    public static final int PAGE_SIZE = 5;
    public int maxScid = 0;
    @RequestMapping("/split")
    public String split(HttpServletRequest request){
        PageInfo info = null;
        info =scService.splitPage(1,PAGE_SIZE);
        request.setAttribute("info",info);
        if(info.getList().size() > maxScid) {
            maxScid = info.getList().size();
        }
        return "scInfo";
    }
    @ResponseBody
    @RequestMapping("/ajaxSplit")
    public void ajaxSplit(int spage, HttpSession session){
        //取得当前page参数的页面的数据
        PageInfo info = scService.splitPage(spage,PAGE_SIZE);
        session.setAttribute("info",info);
    }
    //查询
    @ResponseBody
    @RequestMapping("/conditionBySno")
    public void conditionSplitBysno(String sno,HttpSession session){
        PageInfo info = null;
        info = scService.splitPageBySelectSno(1,PAGE_SIZE,sno);
        session.setAttribute("info",info);
    }
    @ResponseBody
    @RequestMapping("/conditionByCno")
    public void conditionSplitByCno(String cno,HttpSession session){
        PageInfo info = null;
        info = scService.splitPageBySelectCno(1,PAGE_SIZE,cno);
        session.setAttribute("info",info);
    }
    //删除
    @RequestMapping("/delete")
    public String delete(String scid,HttpServletRequest request){
        int num = -1;
        try {
            num = scService.delete(scid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num  > 0 ){
            request.setAttribute("msg","删除成功");
        }else{
            request.setAttribute("msg","删除失败");
        }
        //删除结束后跳到分页显示
        return "forward:/scInfo/split.action";
    }
    //更新
    //点击编辑按钮时
    @RequestMapping("/one")
    public String one(String scid, Model model){
        Sc info = scService.getByID(scid);
        model.addAttribute("thissc",info);
        return"updateScInfo";
    }
    @RequestMapping("/update")
    public String update(String scid,String sno,String cno,String grade,HttpServletRequest request){
        int num = -1;
        try {
            num = scService.update(scid ,sno,cno,grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num > 0) {
            //此时说明更新成功
            request.setAttribute("msg","更新成功!");
        }else{
            request.setAttribute("msg","更新失败!");
        }
        return "forward:/scInfo/split.action";
    }
    //保存
    @RequestMapping("/save")
    public String save(String sno,String cno,String grade,HttpServletRequest request){
        String scid = String.valueOf(maxScid+1);
        System.out.println(scid + " " + sno + " " + cno + " " + grade);
        int num = -1;
        try {
            num = scService.save(scid,sno,cno,grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(num > 0){
            request.setAttribute("msg","增加成功！");
        }else {
            request.setAttribute("msg","增加失败！");
        }
        return "forward:/scInfo/split.action";
    }

}
