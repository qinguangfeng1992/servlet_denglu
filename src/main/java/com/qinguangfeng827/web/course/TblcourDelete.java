package com.qinguangfeng827.web.course;

import com.qinguangfeng827.impl.ImplCous;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TblcourDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // PrintWriter out=response.getWriter();

        String str=request.getParameter("courseid");
        ImplCous implCous = new ImplCous();
        implCous.deleteCous(str);
        // out.print("删除失败！");
        response.sendRedirect("/course/course.jsp");
    }
}
