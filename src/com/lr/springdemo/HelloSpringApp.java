package src.com.lr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // CONSTRUCTOR DEPENDENCY INJECTION
        // retrieve bean from spring container
        Coach coach = context.getBean("soccerCoach", Coach.class);
        // call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // SETTER DEPENDENCY INJECTION
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println("cricketCoach email: " + cricketCoach.getEmail());

        // close the context
        context.close();
    }
}
