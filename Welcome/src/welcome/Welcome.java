/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;
public class Welcome {
    public static void main(String[] args) {
        /**double PI=3.14;
        int radius = 10;
        double area = radius * radius * PI ;
        System.out.println("today is Weakday,I must be working hard!");
        System.out.println("welcome to java");
     System.out.println(area);*/
        /**System.out.println("Hello java!");
        System.out.println("My Name is:");
        long data = Integer.MAX_VALUE +1L;*/
       /**String str1 = "陈某";
       String str2 = "吸毒";
       System.out.println( str1+str2 ); */
       /**int num1=10;
       int num2=20;
       System.out.println("计算结果"+(num1+num2));*/
       //if(1<2||10/0==0){
        //   System.out.println("满足条件");}
       // System.out.println(2<<16);
         int line=10;
           for(int x = 0; x < line; x++){
               for(int y = 0;y< line - x;y++){
                   System.out.print(" ");
               }
               for(int z = x; z < x;z++){
                   System.out.print("*");
               }
               System.out.println();
           }
    }  
}
