package AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import mzwakali.thando.CarInterface;
import mzwakali.thando.CarServiceImpl;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public CarInterface getService() {
        return new CarServiceImpl();
    }
}