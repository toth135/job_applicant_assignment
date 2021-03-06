package web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.register(JobApplicantAssignmentApplicationContext.class);
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servletRegistration= servletContext.addServlet("dispatcherServer", new DispatcherServlet(ctx));

        servletRegistration.setLoadOnStartup(0);
        servletRegistration.addMapping("/");

    }
}
