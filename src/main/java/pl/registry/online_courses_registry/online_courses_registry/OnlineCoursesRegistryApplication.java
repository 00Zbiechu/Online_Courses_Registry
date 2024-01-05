package pl.registry.online_courses_registry.online_courses_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineCoursesRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineCoursesRegistryApplication.class, args);
    }

}
