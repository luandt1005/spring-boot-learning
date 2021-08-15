package me.loda.springsecurityhibernatejwt;


import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {

    // Catch Other Exception
    @ExceptionHandler(Exception.class)
    public String globalException(HttpServletRequest request, Throwable ex) {
        return ex.toString();
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public String exception(HttpServletRequest request, Throwable ex) {
        return ex.toString();
    }
}
