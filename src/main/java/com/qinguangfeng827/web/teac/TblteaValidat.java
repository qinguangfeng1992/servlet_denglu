package com.qinguangfeng827.web.teac;

import com.qinguangfeng827.impl.ImplStu;
import com.qinguangfeng827.impl.ImplTea;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/28.
 */
public class TblteaValidat extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        request.setCharacterEncoding("utf-8");

        String name=request.getParameter("teaname");
        String pwd=request.getParameter("teaid");
        ImplTea implTea = new ImplTea();
        boolean bo= implTea.validatea(name,pwd);
        if(bo){
            session.setAttribute("name", name);
            response.sendRedirect("/tea/teacher.jsp");
        }else {

            response.sendRedirect("login.jsp");
        }
    }
}
