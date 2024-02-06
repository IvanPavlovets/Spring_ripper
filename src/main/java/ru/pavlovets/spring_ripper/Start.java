package ru.pavlovets.spring_ripper;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.pavlovets.spring_ripper.domain.InjectRandomIntAnnotationBeanPostProcessor;
import ru.pavlovets.spring_ripper.domain.Quoter;
import ru.pavlovets.spring_ripper.domain.TerminatorQuoter;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext();
        contex.scan("ru.pavlovets.spring_ripper");
        contex.refresh();
        contex.getBean(Quoter.class).sayQuote();


//        Thread.sleep(100);
//        contex.getBean(Quoter.class).sayQuote();

    }
}
