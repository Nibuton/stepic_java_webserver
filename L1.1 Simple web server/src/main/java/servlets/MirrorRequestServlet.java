package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class MirrorRequestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map<String, String[]> params = request.getParameterMap();
        if (params.size() == 0 || params == null){

            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else{

            response.getWriter().print(request.getParameter("key"));
        }
    }
}
