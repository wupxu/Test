package study.com;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class KafkaDemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(KafkaDemoApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaDemoApplication.class, args);
        logger.info("Done start Spring boot");
    }
}
