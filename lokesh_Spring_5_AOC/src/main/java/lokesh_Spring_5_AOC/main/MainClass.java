package lokesh_Spring_5_AOC.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lokesh_Spring_5_AOC.configure.Spring_Config;
import lokesh_Spring_5_AOC.service.Account;


public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Line - 1");
		ApplicationContext context=new AnnotationConfigApplicationContext(Spring_Config.class);
		Account account = context.getBean(Account.class);
		account.setBalance(50000);
		System.out.println(account);
		account.withdrawBalance();
		account.deposite();
		System.out.println("Line - 2");
	}

}
