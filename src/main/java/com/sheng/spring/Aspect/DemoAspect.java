package com.sheng.spring.Aspect;

import com.sheng.spring.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author shengxingyue, created on 2017/11/29
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class DemoAspect {

    /**
     * 用专门方法来声明切点，这里的切点用的是注解
     */
    @Pointcut("@annotation(com.sheng.spring.annotation.Action)")
    public void annotationPointCut() {}

    /**
     * 使用之前声明的切点
     * @param joinPoint 连接点，真正被织入切面逻辑的地方
     */
    @After("annotationPointCut()")
    public void doAfter(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println(action.name());
        System.out.println("切面添加后处理逻辑");
    }

    /**
     * 使用 execution 表达式来拿到切点
     * @param joinPoint
     */
    @Before("execution(* com.sheng.spring.service.impl.NormalMethodService.*(..))")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("切面添加前处理逻辑");
    }
}
