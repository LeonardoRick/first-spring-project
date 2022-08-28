package src.com.lr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnotationApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("basic-applicationContext.xml");
        // get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        // close the container
        context.close();
    }
}
