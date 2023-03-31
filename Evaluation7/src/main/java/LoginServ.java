import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");
        Connection conn= Connectivity.connection();
        PreparedStatement ps;
        ResultSet rs;
        HttpSession session= req.getSession();
        String password= req.getParameter("password");
        String email= req.getParameter("email");

        try {
            ps= conn.prepareStatement("select email,password,name from evaluation7");
            rs=ps.executeQuery();
            String dbemail=rs.getString(1);
            String dbpassword=rs.getString(2);

            if(dbemail.equals(email) && dbpassword.equals(password)){
                session.setAttribute("sessionname",dbemail);
                resp.sendRedirect("DashboardServ");
            }
            else {
                RequestDispatcher rd= req.getRequestDispatcher("login.html");
                resp.getWriter().print("<h3> Invalid Details !  <h3>");
                rd.include(req,resp);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
