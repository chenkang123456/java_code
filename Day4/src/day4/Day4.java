/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;
class Person{
    public String name;
    public double salary;
    //public int age;
    public void fun(){
        System.out.println(name+"存款为"+"￥"+"salary");
    }
}
public class Day4 {

    
    public static void main(String[] args) {
     Person per = new Person();
     per.name ="飞哥";
     per.salary = 100;
     //per.age =20;
     //Person per1=per;
     //per1.name="龙叔";
    
     per.fun();
    
    }
    
}
