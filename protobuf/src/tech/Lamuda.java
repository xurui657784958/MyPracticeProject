package tech;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lamuda {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int[] array = new int[]{
                1,2,3
        };
        int age = 23;
        Foo foo = ()->{
            System.out.println("Hello World");
        };
        foo.sayHello();

        new Runnable(){
            @Override
            public void run() {
              System.out.println("hello");
            }
        };

        new Thread(() -> {
           System.out.println("hello Thread");
        },"A").start();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add(i);
        }


        List<String> list1 = new ArrayList<>();
        for (int i = 0 ; i < 1000; i++){
            new Thread(()->{
                list1.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println("Thread");
            }).start();
        };


        Thread thread = new Thread();
        thread.start();
        new Thread();
        list.forEach(integer -> System.out.println(integer));

        List<String> integerList = list.stream()
                                                .filter(s -> s>20 && s<50)
                                                .map(s -> String.valueOf(s))
                                                .collect(Collectors.toList());
        integerList.forEach(s -> System.out.println(s));
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        Class clazz = Class.forName("java.util.ArrayList");
        Method method = clazz.getMethod("add",Object.class,String.class);
        method.invoke(integerArrayList,"strung");

        int testVoiltale;

    }

}
