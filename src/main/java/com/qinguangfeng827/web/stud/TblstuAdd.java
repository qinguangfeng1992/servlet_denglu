package com.qinguangfeng827.web.stud;

import com.qinguangfeng827.entity.Tblstudent;
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
public class TblstuAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
      String stuid = request.getParameter("stuid");
        String stuname = request.getParameter("stuname");
        String stuage = request.getParameter("stuage");
        String stusex = request.getParameter("stusex");
      String stupwd = request.getParameter("stupwd");

        ImplStu implStu = new ImplStu();
        Tblstudent tblstudent =new Tblstudent();

        //tblstudent =   implStu.selectId(stuid);

       tblstudent.setStuId(stuid);
        tblstudent.setStuName(stuname);
        tblstudent.setStuAge(Integer.parseInt(stuage));
        tblstudent.setStuSex(stusex);
       tblstudent.setStuPwd(stupwd);
        int result = implStu.insert(tblstudent);
        if (result == 1) {

            response.sendRedirect("../stu/student.jsp");

        } else {
            out.print("<script> alert('新增失败！') ;location='../stu/addstu.jsp'</script>");
        }

    }
}
