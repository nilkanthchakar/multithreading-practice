class Mythread extends Thread{

    public void run(){

        for(int i = 0; i < 11; i++){

            System.out.println("Thread one i is : " + i);

            try{
                sleep(1000);
            }catch(Exception e){

                }
        }


    }


}

class thread2 implements Runnable{


    public void run(){
        for(int i = 10; i > 0; i--){
            System.out.println("thread 2 i is " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }

        }
    }


}

public class Main {
    public static void main(String[] args) {

        Mythread mythread = new Mythread();


        thread2 thread2 = new thread2();
        Thread t1 = new Thread(thread2);
        mythread.start();
        t1.start();




    }


}