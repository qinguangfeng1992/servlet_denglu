package com.qinguangfeng827.web.stud;


import com.qinguangfeng827.impl.ImplStu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/27.
 */
public class TblstuValidat extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        request.setCharacterEncoding("utf-8");

        String name=request.getParameter("stuname");
        String pwd=request.getParameter("stupwd");
        ImplStu implStu=new ImplStu();
       boolean bo= implStu.validat(name,pwd);
        if(bo){
            session.setAttribute("name", name);
            response.sendRedirect("../stu/student.jsp");
 }else {

            response.sendRedirect("login.jsp");
        }
    }
}
