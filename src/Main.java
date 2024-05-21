class Mythread extends Thread{

    public void run(){

        for(int i = 0; i < 11; i++){

            System.out.println(i);

            try{
                sleep(1000);
            }catch(Exception e){

                }
        }


    }


}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


}