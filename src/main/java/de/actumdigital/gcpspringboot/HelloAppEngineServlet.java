package de.actumdigital.gcpspringboot;

//import com.google.appengine.api.utils.SystemProperty;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

@WebServlet(name = "HelloAppEngineServlet", value = "/helloServlet")
public class HelloAppEngineServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        Properties properties = System.getProperties();

        response.setContentType("text/plain");
        response.getWriter().println(
                  "Hello App Engine (Servlet) - Standard using "
//                + SystemProperty.version.get() // todo: no dependencies to App Engine libraries yet, has to be added
                + " Java " + properties.get("java.specification.version")
        );
    }

    public static String getInfo() {
        return "Version: " + System.getProperty("java.version")
                + " OS: " + System.getProperty("os.name")
                + " User: " + System.getProperty("user.name");
    }

}