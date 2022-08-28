package src.com.lr.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TrackCoach2 implements Coach {
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    // add an init method
    @PostConstruct
    public void onInit() {
        System.out.println("trackCoach: inside onInit method");
    }
    // add a destroy method
    @PreDestroy
    public void onDestroy() {
        System.out.println("trackCoach: inside onDestroy method");
    }
}
