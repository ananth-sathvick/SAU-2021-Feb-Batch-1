package Mypackage;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    @After("@annotation(Loggable)")
    public void LoggingAdvice(){
        System.out.println("Running Advice After ");
    }
    
    @AfterReturning("@annotation(Loggable)")
    public void LoggingAdviceReturn(){
        System.out.println("Running Advice AfterReturning ");
    }
    
    @AfterThrowing("@annotation(Loggable)")
    public void LoggingAdviceThrow(){
        System.out.println("Running Advice AfterThrowing ");
    }
    
    @Around("@annotation(Loggable)")
    public void LoggingAdviceAround(){
        System.out.println("Running Advice Around ");
    }
    
}
