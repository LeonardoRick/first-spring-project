package src.com.lr.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CrazyFortuneService implements FortuneService {
    public String getFortune() {
        return "LET'S ROOOOCK!";
    }
}
