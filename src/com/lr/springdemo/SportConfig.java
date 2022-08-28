package src.com.lr.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Think of the @Bean annotation was a wrapper / adapter for third-party classes.
// When you want to make the third-party classes available
// to your Spring framework application context you use @Bean



@Configuration // setup this class a Spring configuration in place of the .xml file
@ComponentScan("src.com.lr.springdemo") // defines in what package our components should be scanned
@PropertySource("classpath:sport.properties") // allows SwimCoach to read a properties file
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() { // the name of the method will be the bean id
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject sad fortune service
    @Bean
    public SwimCoach swimCoach() { // the name of the method will be the bean id
        return new SwimCoach(this.sadFortuneService());
    }
}
