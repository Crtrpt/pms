package com.dj.pms.aop;


import com.dj.pms.config.ApiConfig;
import com.dj.pms.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicInteger;


@Aspect
@Slf4j
@Configuration
public class ApiRequestTimeAop {

    @Autowired
    HttpServletRequest httpServletRequest;

    @Autowired
    ApiConfig apiConfig;


    @Around("execution(* com.dj.pms.api.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object ret = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        if (timeTaken > apiConfig.getGap()) {
            log.warn("api超时{} 尽快处理 API:{} EP: {} GAP: {}", apiConfig.getGap(), httpServletRequest.getRequestURL().toString(), joinPoint, timeTaken);
        } else {
            if (apiConfig.getDisplayRequest()) {
                log.info("API:{} EP: {} GAP: {}", httpServletRequest.getRequestURL().toString(), joinPoint, timeTaken);
            }
        }

        return ret;
    }

}
