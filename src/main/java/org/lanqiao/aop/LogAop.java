package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * Created by Reus_cy on 2017/9/6.
 */
public class LogAop {
    Logger logger= Logger.getLogger(LogAop.class);
    //要记录的日志内容
    String strLog=null;
    //前置通知
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入了前置通知");
        //
        strLog="log Begining method:"
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //后置通知
    public void somethingAfter(JoinPoint joinPoint){
        System.out.println("进入了前置通知");
        //
        strLog="log Begining method:"
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //环绕通知
    public Object somethingAround(ProceedingJoinPoint pjp) throws Throwable {
        long star=System.currentTimeMillis();
        Object retVal = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("执行时间："+(end-star));
        return retVal;
    }
}
