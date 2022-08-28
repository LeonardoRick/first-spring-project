package src.com.lr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext.xml");
        // just watch the lifecycles being called and printing on terminal
        Coach coach = context.getBean("trackCoach", Coach.class);
        context.close();


        // using annotation (@PostConstruct and @PreDestroy) instead of XML init-method destroy-method
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("basic-applicationContext.xml");
        // just watch the lifecycles being called and printing on terminal
        Coach coach2 = context2.getBean("trackCoach2", Coach.class);
        context2.close();

    }
}
