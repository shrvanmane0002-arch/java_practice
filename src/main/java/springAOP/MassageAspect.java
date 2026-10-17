package springAOP;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MassageAspect {
	
	
	@Before("execution(public void rechargePlan())")
	public void beforeMain() {
		
		System.out.println("u r package ecpiring soon...!");
	}
	
	@After("execution(public void rechargePlan())")
	public void AfterMain() {
		
		System.out.println("enjoy ur data pack...!");
		
	}
	
	@Around("execution(* springAOP.Recharge.*(..))")
	public void both(ProceedingJoinPoint p) {
		System.out.println("U R data PACK expiring soon ...! ");
		
		
		try {
			p.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("enjoy ur data pack...!");
		
	}
	
	

}
