package learn;

//CREATE A THREAD USING A INTERFACE
//EARLIER WE USED A CLASS TO MAKE A THREAD (PRact.java FILE)

//ON USING INTERFACE, THREAD WILL NOT HAVE THREAD METHODS YOU WILL HAVE TO CREATE A THREAD METHOD(**LIKE T1.START** TO USE THEM

class Z{
    public void show(){
        System.out.println("class");
    }

}

class Xx extends Z implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e){
            }
        }
    }
}

class Yy implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e){
            }
        }
    }

}

public class ThreadInterface {
    public static void main(String[] args) {

        Runnable obj1=new Xx();
        Runnable obj2=new Yy();

         Thread t1 =new Thread(obj1);
         Thread t2 =new Thread(obj2);

         t1.start();
         t2.start();

    }
}
