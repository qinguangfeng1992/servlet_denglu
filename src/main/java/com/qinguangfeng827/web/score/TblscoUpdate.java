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
public class TblscoUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");

        String stuid = request.getParameter("stuid");
        String courseid = request.getParameter("courseid");
        String score = request.getParameter("score");
        String pkscore = request.getParameter("pkscore");


        ImplSco implSco = new ImplSco();
        Tblscore tblscore  = implSco.selectScoId(pkscore);

        tblscore.setStuId(stuid);
        tblscore.setCourseId(courseid);
        tblscore.setScore(Float.parseFloat(score));


        int result = implSco.updateSco(tblscore);
        if (result == 1) {

            response.sendRedirect("/sco/score.jsp");

        } else {
            out.print("<script> alert('修改失败！') ;location='/sco/editsco.jsp'</script>");
        }
    }
}
