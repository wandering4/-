package servlet;

import com.google.gson.Gson;
import pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * @Author: xuzifan
 * @Date: 2024/4/19 - 04 - 19 - 9:04
 * @Description: servlet
 * @version: 1.0
 */
@WebServlet("/servlet1.do")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        Student stu1=new Student("小黑","男",14,new Date());
        Student stu2=new Student("小白","男",14,new Date());
        Student stu3=new Student("小红","男",14,new Date());
        Student stu4=new Student("小蓝","男",14,new Date());
        ArrayList<Student> list=new ArrayList<>();
        Collections.addAll(list,stu1,stu2,stu3,stu4);


        Gson gson=new Gson();
        String s = gson.toJson(list);
        System.out.println(s);


        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print(s);

    }
}
