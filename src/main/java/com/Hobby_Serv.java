package com;

import com.qinguangfeng831.javabean.Hobby;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


/**
 * Created by Administrator on 2016/8/31.
 */
public class Hobby_Serv extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] arr = request.getParameterValues("h");
        String sex = request.getParameter("sex");
        String born = request.getParameter("born");
        String phone = request.getParameter("phone");
        String QQ = request.getParameter("QQ");
        String descr = request.getParameter("descr");

        Hobby hobb = new Hobby();
        hobb.setUsername(username);
        hobb.setPassword(password);
        hobb.setHobby(Arrays.toString(arr));
        hobb.setSex(sex);
        hobb.setBorn(born);
        hobb.setPhone(phone);
        hobb.setQQ(QQ);
        hobb.setDescr(descr);

        request.setAttribute("hobby", hobb);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
