package src.com.lr.springdemo;

public class BaseballCoach implements Coach {

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public String getBaseballStuff() {
        return "";
    }
}
