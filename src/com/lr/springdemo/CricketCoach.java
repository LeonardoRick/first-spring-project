package src.com.lr.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "cricket: " + fortuneService.getFortune();
    }
}
