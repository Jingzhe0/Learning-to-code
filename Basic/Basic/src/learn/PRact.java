package learn;

//IF I MADE THE FILE NAME AS THREAD , ILL HAVE TO SPECIFICALLY CALL JAVA.LANG.THREAD THATS WHY THIS NAME
//ANY CLASS WHICH EXTENDS A THREAD BECOMES A THREAD
//THE MOST IMP THING FOR IT TO WORK IS THE CLASS SHOULD HAVE A **RUN** METHOD
//THE RUN METHOD OR CLASS OBJECT IS RUN BY USING **START**

//WE USED A LOOP FOR 100 TIMES TO SEE 2 THREADS WORKING PARRALLEL AS FOR 10 TIMES
// THEY ARE SO FAST IT DOESNT CHANGE THE SEQUENCE OF OUTPUT


class X extends Thread {
    public void run(){
        for(int i=0;i<100;i++) {
            try {
                System.out.println("hi");
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Y extends Thread {
    public void run(){
        for(int i=0;i<100;i++) {
            try {
                System.out.println("hello");
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class PRact {
    public static void main(String[] args) {
        X obj1=new X();
        Y obj2=new Y();

        obj2.setPriority(8);   //1 being lowest priority and 10 being highest
        obj1.start();
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){

        }
        obj2.start();
    }
}
