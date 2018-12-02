/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiecheng;


public class JieCheng {

    public static void main(String[] args) {
      long n=20;
      long result=jiecheng(n);
      System.out.println("20的阶乘是"+result);
    }
   public static long jiecheng(long n){
     return(n==1)?1:n*jiecheng(n-1);
             
   } 
}
