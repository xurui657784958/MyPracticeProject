package tech;

public class TestVoiltale {
    int a;
    public static void main(String[] args){
        new TestVoiltale().testVoiltale();
    }
    public synchronized int getTestVoiltale(){
        a++;
        return a;
    }
    public  void  testVoiltale(){
        for (int i = 0 ; i < 10000; i ++){
                new Thread(() -> {
                     int testVoiltale = getTestVoiltale();
                     System.out.println(testVoiltale);
                }).start();
        }
    }
}
