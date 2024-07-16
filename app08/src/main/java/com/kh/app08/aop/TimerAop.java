package com.kh.app08.aop;

import com.kh.app08.member.dao.MemberDao;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimerAop {

    @Around("execution( public * com.kh.app08..*.*(..) )")
    public void m01(ProceedingJoinPoint jp) throws Throwable{
        long start = System.nanoTime();
        jp.proceed();
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("time = " + time);
    }

}
