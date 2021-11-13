import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SessionLab/segura")
public class OutraServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Boolean estaLogado = (Boolean) req.getAttribute("estaLogado");
        if(estaLogado){

        }else{
            resp.sendRedirect("/SessionLab/index.jsp?msg=nao esta logado");
        }
    }




}
