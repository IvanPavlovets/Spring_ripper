package ru.pavlovets.spring_ripper.domain;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Profiling
@Component
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter{
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String msg = "I'll be back";

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("msg = " + msg);
        }
    }
}
