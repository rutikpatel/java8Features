package org.learn.java8.functionalInterface;

@FunctionalInterface
interface Test1{
    void m1();
}
@FunctionalInterface
interface Test2 extends Test1{
}


public class ThreadDemo  {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run method executed");
            }
        };
        Thread t = new Thread(r);
        t.start();

//      Lambda Expression
        Runnable r1=()->{System.out.println("Run method executed");};
        Thread t1= new Thread(r1);
        t1.start();

    }

}
