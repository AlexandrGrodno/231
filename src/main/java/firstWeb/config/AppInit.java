package firstWeb.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                SpringConfig.class
        };
    }

    protected String[] getServletMappings()  {
        return new String[]{"/"};
    }
}
