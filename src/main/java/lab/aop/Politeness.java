package lab.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import lab.model.Customer;
import lab.model.Squishee;

@Aspect
public class Politeness {

    @Before("execution(* sellSquishee(..))")
    public void sayHello(JoinPoint joinPiont) {
        System.out.println("Hello " + ((Customer) joinPiont.getArgs()[0]).getName() + ". How are you doing?");
    }

    @AfterReturning(pointcut = "execution(* sellSquishee(..))",
            returning = "retVal", argNames = "retVal")
    public void askOpinion(Object retVal) {
        System.out.println("Is " + ((Squishee) retVal).getName() + " Good Enough?");
    }

    public void sayYouAreNotAllowed() {
        System.out.println("Hmmm...");
    }

    public void sayGoodBye() {
        System.out.println("Good Bye!");
    }

    public Object sayPoliteWordsAndSell(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Hi!");
        Object retVal = pjp.proceed();
        System.out.println("See you!");
        return retVal;
    }

}