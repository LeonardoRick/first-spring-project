package src.com.lr.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    // add an init method
    public void onInit() {
        System.out.println("trackCoach: inside onInit method");
    }
    // add a destroy method
    public void onDestroy() {
        System.out.println("trackCoach: inside onDestroy method");
    }
}
