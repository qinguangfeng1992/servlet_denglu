package com.qinguangfeng827.web.score;

import com.qinguangfeng827.entity.Tblscore;

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
public class TblscoAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");

       // String pkScore  = request.getParameter("pkScore");
        String stuId = request.getParameter("stuId");
        String courseId = request.getParameter("courseId");
        String score = request.getParameter("score");


        ImplSco implSco = new ImplSco();
        Tblscore tblscore = new Tblscore();

        //tblscore.setPkScore(Integer.parseInt(pkScore));
        tblscore.setStuId(stuId);
        tblscore.setCourseId(courseId);
        tblscore.setScore(Float.parseFloat(score));

        int result = implSco.insertSco(tblscore);
        if (result == 1) {

            response.sendRedirect(request.getContextPath()+"/sco/score.jsp");

        } else {
            out.print("<script> alert('新增失败！') ;location='../sco/addsco.jsp'</script>");
        }
    }
}
