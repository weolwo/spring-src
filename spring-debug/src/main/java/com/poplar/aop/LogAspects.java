package com.poplar.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * Create BY poplar ON 2020/4/17
 * AOP测试
 *
 * @Aspect 表明这是易额切面类
 */
//@Aspect
//@Component
public class LogAspects {

    //抽取公共的切入点表达式
    //@Pointcut("execution( * com.poplar.proxy.Calculator.*(..))")
    public void pointCut() {
    }

    ;

    //@Before("execution( * com.poplar.proxy.Calculator.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("@Before...");
    }

    //目标方法正常异常结束都会调用
    //@After("pointCut()")
    public void after() {
        System.out.println("@After after");
    }

    //方法正常放回
    //JoinPoint必须放在前面，否则会报error at ::0 formal unbound in pointcut
    //@AfterReturning(value = "pointCut()", returning = "result")
    public Integer returning(JoinPoint joinPoint, Object result) {
        System.out.println("@AfterReturning方法名" + joinPoint.getSignature().getName());
        return 100;
    }

    //方法出现异常
    //@AfterThrowing(value = "pointCut()", throwing = "exception")
    public void throwable(Exception exception) {
        System.out.println("@AfterThrowing 异常信息" + exception);
    }

    //@Around(value = "pointCut()")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("@around start..." + joinPoint.getSignature().getName() + "参数" + Arrays.asList(joinPoint.getArgs()));
        Object[] args = joinPoint.getArgs();
        try {
            joinPoint.proceed(args);
            System.out.println("@around stop..." + joinPoint.getSignature().getName() + "参数" + Arrays.asList(joinPoint.getArgs()));

        } catch (Throwable throwable) {
            System.out.println("@around 异常..." + joinPoint.getSignature().getName() + "参数" + Arrays.asList(joinPoint.getArgs()));

            throwable.printStackTrace();
        } finally {
            System.out.println("@around 返回..." + joinPoint.getSignature().getName() + "参数" + Arrays.asList(joinPoint.getArgs()));
        }

    }

}
