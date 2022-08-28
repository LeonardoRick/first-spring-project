package src.com.lr.springdemo;

import org.springframework.beans.factory.annotation.Value;

// this file will not be found when scanning for beans because
// it doesn't have a @Component annotation. The way we are defining
// this class as a bean, is on the SportConfig.java setup with the usage
// of the @Bean annotation
public class SwimCoach implements Coach {
    FortuneService fortuneService;

    @Value("${sport.email}")
    private String email;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return this.email +  ": Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }


}
