package com.project.config;
import com.project.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi R8");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Primary
    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
