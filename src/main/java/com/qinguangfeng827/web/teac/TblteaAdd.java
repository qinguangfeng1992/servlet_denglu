package com.qinguangfeng827.web.teac;

import com.qinguangfeng827.entity.Tblteacher;
import com.qinguangfeng827.impl.ImplTea;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/8/28.
 */
public class TblteaAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        String teaid = request.getParameter("teaid");
        String teaname = request.getParameter("teaname");


        ImplTea implTea = new ImplTea();
        Tblteacher tblteacher = new Tblteacher();

        tblteacher.setTeaId(teaid);
        tblteacher.setTeaName(teaname);

        int result = implTea.insertTea(tblteacher);
        if (result == 1) {

            response.sendRedirect("/tea/teacher.jsp");

        } else {
            out.print("<script> alert('新增失败！') ;location='../addtea.jsp'</script>");
        }

    }
}
