package com.koreait.SpringSecurityStudy.security.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class JwtAuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        //해당 메소드가 아니면 그냥 다음 필터로 넘김
        List<String> methods = List.of("POST", "PUT", "GET", "PATCH", "DELETE");
        if (!methods.contains(request.getMethod())) {
            filterChain.doFilter(servletRequest, servletResponse);
        }







        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("후처리");
    }
}
