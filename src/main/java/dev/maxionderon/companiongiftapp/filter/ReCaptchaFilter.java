package dev.maxionderon.companiongiftapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.maxionderon.companiongiftapp.service.recaptcha.ReCaptchaService;

@Component
public class ReCaptchaFilter implements Filter {

    @Autowired
    private ReCaptchaService reCaptchaService;

    private static final String RECAPTCHA_HEADER_NAME = "recaptcha-response";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        
        if( httpRequest.getMethod().equals("OPTIONS")) {

            filterchain.doFilter(request, response);

        } else {

            if (this.reCaptchaService.validateRequestViaReCaptcha(httpRequest.getHeader(RECAPTCHA_HEADER_NAME)) == false) {

                throw new ServletException("reCaptcha not Valid");

            }

            filterchain.doFilter(request, response);

        }        
        
    }

}