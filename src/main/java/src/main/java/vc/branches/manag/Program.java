package src.main.java.vc.branches.manag;

import src.main.java.vc.branches.manag.services.HelloService;

public class Program {
    private final HelloService helloService;

    public Program(HelloService helloService) {
        this.helloService = helloService;
    }

    public void start() {
        helloService.sayHello();
    }
}
