// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Hello extends HttpServlet {

   private String message;

   public void init() throws ServletException {
      // Do required initialization
<<<<<<< HEAD
      message = "Hello WorldTest: src/main/java/Hello.java";
=======
      message = "Hello Worldtes33t: src/main/java/Hello.java";
>>>>>>> 692a1dfbc7ad7b52baeb1d6094f1997f6cde95db
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
   }
}
