package com.unifun.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class ListServlet extends HelloServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String p = req.getParameter("id");
        PrintWriter writer = resp.getWriter();
        ArrayList<String> car = new ArrayList<String>();

        car.add("BMW");
        car.add("VW");
        car.add("LADA");

        if(Integer.parseInt(p)==1)  writer.write("<h1>Model: "+car.get(0)+"</h1>");
        else if (Integer.parseInt(p)==2)  writer.write("<h1>Model: "+car.get(1)+"</h1>");
        else if (Integer.parseInt(p)==3)  writer.write("<h1>Model: "+car.get(2)+"</h1>");


    }
}
