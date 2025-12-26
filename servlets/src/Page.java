import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/login",loadOnStartup = 3)
public class Page extends GenericServlet {
    public Page(){
        System.out.println("Created a Page");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("It is initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("being destroyed");
    }
}
