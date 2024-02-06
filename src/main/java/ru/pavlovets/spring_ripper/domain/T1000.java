package ru.pavlovets.spring_ripper.domain;

import org.springframework.stereotype.Component;

@Profiling
@Component
public class T1000 extends TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Я жидкий");
    }
}
