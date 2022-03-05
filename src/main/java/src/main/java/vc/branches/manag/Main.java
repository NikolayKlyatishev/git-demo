package src.main.java.vc.branches.manag;

import src.main.java.vc.branches.manag.services.HelloCaseService;
import src.main.java.vc.branches.manag.services.HelloService;
import src.main.java.vc.branches.manag.services.Strategy;

public class Main {
    public static void main(String[] args) {
        var program = new Program(new HelloService(), new HelloCaseService());
        program.start();
    }
}
