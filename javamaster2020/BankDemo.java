// package javamaster2020;

// public class BankDemo
// {
//     public static void main(String[] args) {
        
//         ICI royal =new ICI();

//         Thread ekta= new Thread(royal);
//         ekta.setName(ekta);
//         Thread aashka =new Thread(royal,"aashka");

//         ekta.start();
//         aashka.start();

//         try{
//             Thread.sleep(3000);
//             System.out.println("final+>"+royal.balance);
//         }
//         catch(InterruptedException e){

//             e.printStackTrace();
//         }
//     }
// }
// class ICI extends Thread
// {
//     int balance=15000;
//     String name;
//     int count=0;
//     static int demo=0;

//     synchronized static void updateDemo(){

//         demo++;
//         synchronized (ICI.class)
//         {
//             System.out.println("class level lock....");
//         }
//     }

//     public void run()
//     {
//         wid(10000);
//     }
//     void wid(int amt)
//     {
//         synchronized(this)
//         {
//             if (balance - amt >= 5000) {
//             try{
//                 sleep(1000);
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//             balance=balance-amt;

//             System.out.println(("wid done..."+currentThread().getName()));
//             System.out.println("balance"+balance);
//         }
//         else{
//             System.out.println("insufficient balance.....for...." + currentThread().getName());
//         }
//         }
//     }
// }