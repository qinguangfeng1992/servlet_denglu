package com.qinguangfeng827.web.score;

import com.qinguangfeng827.impl.ImplSco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TblscoValidat extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        request.setCharacterEncoding("utf-8");

        String pkScore  = request.getParameter("pkScore");
        String score  = request.getParameter("score");
        ImplSco implSco = new ImplSco();
        boolean bo= implSco.validasco(Float.parseFloat(score), Integer.parseInt(pkScore));
        if(bo){
            session.setAttribute("score", score);
            response.sendRedirect("/sco/score.jsp");
        }else {

            response.sendRedirect("login.jsp");
        }






    }
}
