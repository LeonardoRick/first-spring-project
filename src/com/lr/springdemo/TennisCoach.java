package src.com.lr.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// usage of annotation to set up a Spring bean. When spring scan this file, it will find this annotation and will
// automatically register this bean with the given beanId
@Component
public class TennisCoach implements Coach {

    @Value("${sport.email}")
    private String email;
    // order of priority: Method Injection (setter injection) => Field Injection   => Constructor Injection

    @Autowired
    @Qualifier("happyFortuneService") // happyFortuneService is the default beanId of the HappyFortuneService class
    private FortuneService fortuneService;

    // if this is uncommented, this will be prioritized over the above Field injection
    // and sadFortuneService will be the one injected
    @Autowired
    @Qualifier("crazyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Autowired
    TennisCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return this.email + ": Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
