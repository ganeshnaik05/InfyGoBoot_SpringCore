package com.naigan.irs.utility;

import com.naigan.irs.exception.InfyGoBootException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @AfterThrowing(pointcut = "execution(* com.naigan.irs.repository.*.*(..))",throwing=
    "exception")
    public void logExceptionFromRepository(InfyGoBootException exception) throws InfyGoBootException{
        log(exception);
    }
    @AfterThrowing(pointcut = "execution(* com.naigan.irs.service.*.*(..))",throwing=
            "exception")
    public void logExceptionFromService(InfyGoBootException exception) throws InfyGoBootException{
        if(exception.getMessage().contains("Service")) {
            log(exception);
        }
    }
    private void log(Exception exception){
        Logger logger= LoggerFactory.getLogger(this.getClass());
        logger.error(exception.getMessage(),exception);
    }
}
