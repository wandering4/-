package servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import pojo.User;

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
 * @Date: 2024/4/18 - 04 - 18 - 21:38
 * @Description: servlet
 * @version: 1.0
 */
@WebServlet("/testServlet.do")
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user1=new User("300",20,"男", new Date());
        User user2=new User("33",20,"男", new Date());
        User user3=new User("31420",20,"男", new Date());
        User user4=new User("0",20,"男", new Date());
        User user5=new User("3",20,"男", new Date());
        ArrayList<User> users=new ArrayList<>();
        Collections.addAll(users,user1,user2,user3,user4,user5);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        GsonBuilder gsonBuilder=new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss");
        Gson gson=gsonBuilder.create();
        String u=gson.toJson(user1);
        System.out.println(u);
        resp.getWriter().print(u);

    }
}
