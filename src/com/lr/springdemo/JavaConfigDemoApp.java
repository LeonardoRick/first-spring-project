package src.com.lr.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println("\n");

        // usage of swim bean that is not a @Component but is defined as @Bean on SportConfig file
        Coach swimCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        context.close();
    }
}
