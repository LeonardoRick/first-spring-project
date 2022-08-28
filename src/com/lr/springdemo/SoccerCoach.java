package src.com.lr.springdemo;

public class SoccerCoach implements Coach {
    private  FortuneService fortuneService;
    SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public String getDailyWorkout() {
        return "Kick the ball 1000 times today";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
