/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.docman;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.InitialContext;

public class DocServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        ObjectMapper objmap = new ObjectMapper();
        String result = objmap.writeValueAsString(list.findAll());

        PrintWriter out = response.getWriter();
        out.println(result);
    }

    DocumentService list = new DocumentServiceImpl();

    

}
    
    
