package com.example.jspbasic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-number")
public class FindNumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String input = req.getParameter("input");
        String s = "";
        for(int i=0; i <= input.length()-1; i++){
            try{
                Integer.parseInt(String.valueOf(input.charAt(i)));
                s = s.concat(String.valueOf(input.charAt(i)));
            }
            catch (Exception e){}
        }
       out.print(s);
    }
}
