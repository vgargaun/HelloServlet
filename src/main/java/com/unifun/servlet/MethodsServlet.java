package com.unifun.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/method/")
@Controller
public class MethodsServlet {

    @ResponseBody
    @RequestMapping("/hello1")
    public String Hello1(){
        return "HELLO ONE";
    }

    @ResponseBody
    @RequestMapping("/hello2")
    public String Hello2(){
        return "HELLO TWO";
    }

    @ResponseBody
    @RequestMapping("/hello3")
    public String Hello3(){
        return "HELLO THREE";
    }
}
