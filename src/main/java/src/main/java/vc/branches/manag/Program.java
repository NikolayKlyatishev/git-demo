package src.main.java.vc.branches.manag;

import src.main.java.vc.branches.manag.services.Strategy;

public class Program {
    private final Strategy helloService;

    public Program(Strategy helloService) {
        this.helloService = helloService;
    }

    public void start() {
        helloService.sayHello();
    }
}
