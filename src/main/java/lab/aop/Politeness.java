package lab.aop;

import lab.model.Customer;
import lab.model.Squishee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Politeness {

    @Pointcut("execution(* sellSquishee(..))")
    public void sellSquishee() {
    }

    @Before("sellSquishee()")
    public void sayHello(JoinPoint joinPiont) {
        System.out.println("Hello " + ((Customer) joinPiont.getArgs()[0]).getName() + ". How are you doing?");
    }

    @AfterReturning(pointcut = "sellSquishee()", returning = "retVal", argNames = "retVal")
    public void askOpinion(Object retVal) {
        System.out.println("Is " + ((Squishee) retVal).getName() + " Good Enough?");
    }

    @AfterThrowing("sellSquishee()")
    public void sayYouAreNotAllowed() {
        System.out.println("Hmmm...");
    }

    @After("sellSquishee()")
    public void sayGoodBye() {
        System.out.println("Good Bye!");
    }

    @Around("sellSquishee()")
    public Object sayPoliteWordsAndSell(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Hi!");
        Object retVal = pjp.proceed();
        System.out.println("See you!");
        return retVal;
    }

}