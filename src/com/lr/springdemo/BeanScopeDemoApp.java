package src.com.lr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/xml/bean-scope-applicationContext.xml");

        // retrieve bean from spring container
        Coach coach1 = context.getBean("soccerCoach", Coach.class);
        Coach coach2 = context.getBean("soccerCoach", Coach.class);


        Coach bCoach1 = context.getBean("trackCoach", Coach.class);
        Coach bCoach2 = context.getBean("trackCoach", Coach.class);

        // Check if they are the same beans. If we're using 'prototype' or 'singleton' on .xml definition of bean scope
        boolean result = coach1 == coach2;
        System.out.println("\nis equal: " + result);
        System.out.printf("Memory location for coach1: " + coach1);
        System.out.printf("\nMemory location for coach2: " + coach2 + "\n");


        boolean bResult = bCoach1 == bCoach2;
        System.out.println("\nis equal: " + bResult);
        System.out.printf("Memory location for coach1: " + bCoach1);
        System.out.printf("\nMemory location for coach2: " + bCoach2);
        context.close();
    }
}
