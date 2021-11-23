import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


    @WebServlet("/desconectar")
    public class LogoutServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

            HttpSession session = req.getSession(false);
            Boolean estaLogado = false;
            if (session == null) {
                resp.sendRedirect("/login_war/index.jsp?msg=nao esta logado");
            } else {
                estaLogado = (Boolean) session.getAttribute("estaLogado");

                if (estaLogado != null && !estaLogado) {
                    resp.sendRedirect("/login_war/index.jsp?msg=nao esta logado");
                }
            }if(estaLogado){
                req.getSession().invalidate();
                req.getSession().setMaxInactiveInterval(1);
            }
        }
    }