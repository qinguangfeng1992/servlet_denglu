package com.qinguangfeng827.web.teac;


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
public class TblteaDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
       // PrintWriter out=response.getWriter();

        String str=request.getParameter("teaid");
        ImplTea implTea = new ImplTea();
        implTea.deleteTea(str);
       // out.print("删除失败！");
       response.sendRedirect("/tea/teacher.jsp");
    }
}
