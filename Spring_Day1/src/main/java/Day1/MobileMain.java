package Day1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {

	public static void main(String[] args) {

//		Mobile_Implementation mobile_Implementation = new Mobile_Implementation();
//		mobile_Implementation.use();

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("mobile.xml");
		MobileUse mobileUse = (MobileUse) beanFactory.getBean("mobileUse");
		mobileUse.use();
	}
}
