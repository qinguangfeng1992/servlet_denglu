package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/8/31.
 */
public class Job_Session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setCharacterEncoding("utf-8");

/**
 * 先获取 实体类里边 的名字
 */
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        String[] arr = request.getParameterValues("hobby");
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String descr = request.getParameter("descr");


        Job_Bean job_bean = new Job_Bean();
        job_bean.setUsername(name);
        job_bean.setPassword(password);
        job_bean.setHobby(Arrays.toString(arr));
        job_bean.setSex(sex);
        job_bean.setAddress(address);
        job_bean.setDescr(descr);

        session.setAttribute("job",job_bean);

        response.sendRedirect(request.getContextPath()+"/index_two.jsp");

    }
}
