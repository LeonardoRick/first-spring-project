package src.com.lr.springdemo;

public class HelloApp {
    public static void main(String[] args) {
        // create the object
        Coach coach = new BaseballCoach();
        // use the object
        System.out.println(coach.getDailyWorkout());
    }
}
