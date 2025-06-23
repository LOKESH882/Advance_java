package lokesh_Spring_5_AOC.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Message {
	@Pointcut("execution (public void withdrawBalance())")
	 public void withDrawMessageSent() {
		 
	 }
	
	@Before("withDrawMessageSent()")
	public void withDrawSms() {
		System.out.println("SMS send Before Withdraw...");
	}
	
	@Pointcut("execution (public void deposite() )")
	 public void depositeMessageSent() {
		 
	 }
	@After("depositeMessageSent()")
	public void depositeSms() {
		System.out.println("SMS send After Deposite...");
	}
	
	/*
	 * @Pointcut("execution (* lokesh_Spring_5_AOC.service.Account.*(..))") public
	 * void executeAll() {
	 * 
	 * }
	 * 
	 * @After("executeAll()") public void sendMessageToAll() {
	 * System.out.println("Send Message TO All"); }
	 */
	
	@Pointcut("execution(* lokesh_Spring_5_AOC.service.Account.*(..))")
	public void checkBeforeAfter() {
		
	}
	
	@Around("checkBeforeAfter()")
	public void aroundMessage(ProceedingJoinPoint p) {
		System.out.println("======== before method pin is validated ========");
		try {
			p.proceed();
		}catch(Throwable e) {
			System.out.println(e);
		}
		System.out.println("===== After Method Send SMS Logic =====");
	}
	
}
