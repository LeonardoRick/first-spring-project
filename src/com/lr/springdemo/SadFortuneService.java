package src.com.lr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You really suck playing";
    }
}
