package com.qinguangfeng827.web.stud;

import com.qinguangfeng827.impl.ImplStu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/8/28.
 */
public class TblstuDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();

        String str=request.getParameter("stuid");
        ImplStu implStu=new ImplStu();
        implStu.delete(str);
//        out.print("alert('删除失败')");
       response.sendRedirect("../stu/student.jsp");



    }
}
