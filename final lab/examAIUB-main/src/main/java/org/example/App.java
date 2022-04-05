package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        InterfaceExam iMid = applicationContext.getBean("cM", InterfaceExam.class);
        InterfaceExam iFinal = applicationContext.getBean("cF", InterfaceExam.class);
        if(iMid.examOnGoing() != null)
        {
            System.out.println(iMid.examOnGoing());
        }
        if(iFinal.examOnGoing() != null)
        {
            System.out.println(iFinal.examOnGoing());
        }
    }
}
