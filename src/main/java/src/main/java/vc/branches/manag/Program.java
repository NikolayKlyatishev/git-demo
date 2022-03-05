package src.main.java.vc.branches.manag;

import src.main.java.vc.branches.manag.services.Strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    private final List<Strategy> helloService;

    public Program(Strategy ... helloService) {
        this.helloService = Arrays.stream(helloService).collect(Collectors.toList());
    }

    public void start() {
        helloService.forEach(Strategy::sayHello);
    }
}
