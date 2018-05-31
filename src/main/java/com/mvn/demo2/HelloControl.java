package com.mvn.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloControl {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("uname","张三");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }


}
