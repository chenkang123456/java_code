/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.InputMismatchException;

import java.util.Scanner; 
public class Main {

public static void main(String[] args) {

// 产生一个随机数

int number = (int) (Math.random() * 100) + 1; 
// 加入count

int count = 0; 
// 在这里加入最大值，和最小值

int max = 100;

int min = 1; 
while (true) {

// 键盘录入数据

Scanner sc = new Scanner(System.in);

System.out.println("请输入你要猜的数据：(" + min + "~" + max + ")");

try {

count++;

int guessNumber = sc.nextInt();

// 判断

if (guessNumber > number) {

max = guessNumber;

System.out.println("你猜大了");

} else if (guessNumber < number) {

min = guessNumber;

System.out.println("你猜小了");

} else {

System.out.println("恭喜你,花了" + count + "次就猜中了");

// 问是否继续

System.out.println("请问还要继续吗？(yes)");

sc = new Scanner(System.in);

String str = sc.nextLine();

if ("yes".equals(str)) {

// 重写赋值随机数

number = (int) (Math.random() * 100) + 1;

count = 0;

max = 100;

min = 1;

} else {

break;

}

}

} catch (InputMismatchException e) {

System.out.println("你输入的数据有误");

}

}

}

} 
    
    

