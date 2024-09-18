package com.example.springserver.Fillters;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@WebFilter(filterName = "filter1",urlPatterns = "/*")
public class fillter1 implements Filter {
    Logger logger = Logger.getLogger(this.getClass().toString());
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filler init called");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filler doFilter called");System.out.println(servletRequest.getLocalName());
        String a= servletRequest.getParameter("startTime");
        System.out.println(a);
        logger.warning(a);
        filterChain.doFilter(servletRequest, servletResponse);
    }
    @Override
    public void destroy() {
        System.out.println("Filler destroy called");
    }

}
