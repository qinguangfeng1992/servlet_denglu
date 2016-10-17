package com.qinguangfeng827.web.stud;

import com.qinguangfeng827.impl.ImplStu;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 这是相当于，另一个窗口的 dealdenglu的处理性JSP
 * 我这里写了 Servlet类就不用再写JSP的处理页面了
 * Created by Administrator on 2016/8/27.
 */
public class TblstuAjax extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        request.setCharacterEncoding("utf-8");
        //==取
        String name = request.getParameter("textname");
        String pwd = request.getParameter("pwd");
        //==调
        ImplStu implStu = new ImplStu();
        boolean bo = implStu.validat(name, pwd);
        if (bo) {
            //==转，或者说是输出
            session.setAttribute("name", name);
            out.print("{result:true}");
            //      response.sendRedirect("index.jsp");
        } else {
            out.print("{result:false}");
            //    response.sendRedirect("login.jsp");
        }
        out.close();
    }
}
