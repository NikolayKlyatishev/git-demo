package src.main.java.vc.branches.manag;

import src.main.java.vc.branches.manag.services.HelloService;
import src.main.java.vc.branches.manag.services.Strategy;

public class Main {
    public static void main(String[] args) {
        Strategy hello = new HelloService();
        var program = new Program(hello);
        program.start();
    }
}
