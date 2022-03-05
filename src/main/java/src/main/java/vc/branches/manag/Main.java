package src.main.java.vc.branches.manag;

import src.main.java.vc.branches.manag.services.HelloService;

public class Main {
    public static void main(String[] args) {
        var program = new Program(new HelloService());
        program.start();
    }
}
