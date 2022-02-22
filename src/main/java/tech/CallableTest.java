package tech;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello World RG");
        return 1024;
    }
}
