package ru.ivan.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ivan.spring.rest.configuration.MyConfig;
import ru.ivan.spring.rest.entity.User;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =context.getBean("communication", Communication.class);
        List<User> allUser = communication.getAllUsers();
        System.out.println( allUser );
        System.out.println("Answer: " + communication.getAnswer());
    }
}
