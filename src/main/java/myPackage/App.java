package myPackage;

import myPackage.config.AppConfig;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class App {
    public static void main(String[] params) throws Exception {
        //SPRING
        AnnotationConfigWebApplicationContext webApplication = new AnnotationConfigWebApplicationContext();
        webApplication.register(AppConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplication);

        // JETTY
        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.addServlet(new ServletHolder(dispatcherServlet), "/");
        Server server = new Server(8080);
        server.setHandler(contextHandler);
        server.start();
        server.join();
    }
}
