package com.qinguangfeng827.web.score;

import com.qinguangfeng827.impl.ImplSco;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/29.
 */
public class TblscoDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // PrintWriter out=response.getWriter();

        String str=request.getParameter("pkscore");
        ImplSco implSco = new ImplSco();
        implSco.deleteSco(str);
        // out.print("删除失败！");
        response.sendRedirect("/sco/score.jsp");
    }
}
