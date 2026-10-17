package springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	
public static void main(String[] args) {
	
	ApplicationContext contaxt = new AnnotationConfigApplicationContext(MyConfigClass.class);
	
	Recharge r = contaxt.getBean(Recharge.class);
	
	r.rechargePlan();
	
}

}
