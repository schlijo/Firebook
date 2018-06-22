package ch.basler.fire.marshall;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by b033635 on 20.01.2016.
 */
@javax.servlet.annotation.WebServlet(name = "MyServlet", urlPatterns = "/public")
public class MyServlet extends javax.servlet.http.HttpServlet {
  protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {

  }

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {

//    response.setContentType("text/html");
//    response.setCharacterEncoding("UTF-8");
    response.sendRedirect("/index.html");

//    try (PrintWriter writer = response.getWriter()) {
//
//      writer.println("<!DOCTYPE html><html>");
//      writer.println("<head>");
//      writer.println("<meta charset=\"UTF-8\" />");
//      writer.println("<title>MyServlet.java:doGet(): Servlet code!</title>");
//      writer.println("</head>");
//      writer.println("<body>");
//
//      writer.println("<h1>This is a simple java servlet4.</h1>");
//
//      writer.println("</body>");
//      writer.println("</html>");
//    }
  }

}
