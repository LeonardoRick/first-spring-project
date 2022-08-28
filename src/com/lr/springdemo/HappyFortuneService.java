package src.com.lr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Your the best of the team";
    }
}
