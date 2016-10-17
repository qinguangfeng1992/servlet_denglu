package com.qinguangfeng827.web.course;

import com.qinguangfeng827.entity.Tblcourse;
import com.qinguangfeng827.entity.Tblscore;
import com.qinguangfeng827.impl.ImplCous;
import com.qinguangfeng827.impl.ImplSco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TblcourUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");

        String courseid = request.getParameter("courseid");
        String teaid = request.getParameter("teaid");
        String coursename = request.getParameter("coursename");


        ImplCous implCous = new ImplCous();
        Tblcourse tblcourse  = implCous.selectCousId(courseid);

        tblcourse.setCourseId(courseid);
        tblcourse.setTeaId(teaid);
        tblcourse.setCourseName(coursename);


        int result = implCous.updateCous(tblcourse);
        if (result == 1) {

            response.sendRedirect("/course/course.jsp");

        } else {
            out.print("<script> alert('修改失败！') ;location='/course/editcour.jsp'</script>");
        }
    }
}
