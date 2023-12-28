package Day1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimMain {

	public static void main(String[] args) {
//		MobileUse mobileUse = new MobileUse();
//		mobileUse.use();
		BeanFactory bf = new ClassPathXmlApplicationContext("mobile.xml");
		MobileUse mobileUse = (MobileUse) bf.getBean("mobileUse");
		mobileUse.use();

//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("sim.xml");
//		SimUse simUse = (SimUse) beanFactory.getBean("simUse");
//		simUse.balance();

		SimUse simUse = new SimUse();
		simUse.balance();
	}

}
