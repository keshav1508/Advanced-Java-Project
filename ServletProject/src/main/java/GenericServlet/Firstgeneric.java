package GenericServlet;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
public class Firstgeneric extends GenericServlet{
public void service(ServletRequest req, ServletResponse res) throws IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String number1, number2;
if(req.getParameter("n1")!=null) {
number1 = req.getParameter("n1");
number2 = req.getParameter("n2");
}
else if(req.getParameter("n3")!=null) {
number1 = req.getParameter("n3");
number2 = req.getParameter("n4");
}
else { 
number1 = req.getParameter("n5");
number2 = req.getParameter("n6");
}
int n1=Integer.parseInt(number1);
int n2=Integer.parseInt(number2);
int result=n1+n2;
out.print("<h1> "+n1+" + "+n2+" = "+result+" <h1>");
out.close();
}
}
