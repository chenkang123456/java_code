/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;
//猜字符游戏
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
int count = 0; //猜错的次数
char[] chs = generate(); //随机生成的字符数组
System.out.println(chs); //作弊
while(true){ //自造死循环
System.out.println("猜吧!");
String str = scan.next().toUpperCase(); //获取用户输入的字符串
if(str.equals("EXIT")){ //判断str是否是EXIT
System.out.println("下次再来吧!");
break;
}
char[] input = str.toCharArray(); //将字符串转换为字符数组
int[] result = check(chs,input);  //对比
if(result[0]==chs.length){ //位置对为5
int score = chs.length*100 - count*10; //一个字符100分，错一次减10分
System.out.println("恭喜你猜对了，得分:" + score);
break; //猜对时跳出循环
}else{ //没猜对
count++; //猜错次数增1
System.out.println("字符对:"+result[1]+"个，位置对:"+result[0]+"个");
}
}
}
//随机生成5个字符数组
public static char[] generate(){
char[] chs = new char[5];
char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
'W', 'X', 'Y', 'Z'};
boolean[] flags = new boolean[letters.length]; //1.
for(int i=0;i<chs.length;i++){
int index;
do{
index = (int)(Math.random()*letters.length); //0到25
}while(flags[index]==true); //2.
chs[i] = letters[index];
flags[index] = true; //3.
}
return chs;
}
//对比随机数组与用户输入的数组
public static int[] check(char[] chs,char[] input){
int[] result = new int[2];
for(int i=0;i<chs.length;i++){
for(int j=0;j<input.length;j++){
if(chs[i]==input[j]){ //字符对
result[1]++; //字符对个数增1
if(i==j){ //位置对
result[0]++; //位置对个数增1
}
break;
}
}
}
return result;
}
    }
    
