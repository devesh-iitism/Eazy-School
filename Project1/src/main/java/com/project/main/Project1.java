package com.project.main;

import com.project.beans.Vehicle;
import com.project.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}
