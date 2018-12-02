/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayutils;

import java.util.Arrays;

/**
 *
 * @author chenkang
 */
public class ArrayUtils {
  public static void main(String[] args) {
  /**int i,max,min;
  int A[] = {1,2,3,4,6};
  max=min=A[0];
  System.out.print(" 数组内的元素有：");
  for(i=0;i<A.length;i++)
  {
      System.out.print(A[i]+" ");
      if(A[i]>max)
          max=A[i];
      if(A[i]<min)
          min=A[i];
  }
  System.out.println("\n最大值： "+max);
  System.out.println("最小值： "+min);
  System.out.println("和值："+(max+min));*/
  /**int []str1={1,3,5,7,9} ;
  int []str2={2,4,6,8,10};
  int strLen1=str1.length;
  int strLen2=str2.length;
  str1=Arrays.copyOf(str1,strLen1 + strLen2);
  System.out.print(" 数组内的元素有：");
  //System.arraycopy(str2,0,strLen1,strLen2);
  System.out.println(Array.toString(str1));*/
  //int A[]={1,2,3,4,5};
  int []rt=new int[]{1,2,3,4,5};
  for(int i=0;i<rt.length/2;i++){
      int temp=rt[i];
      rt[i]=rt[rt.length-1-i];
      rt[rt.length-1-i]=temp;
  }
  for(int i:rt){
      System.out.println(i);
  }
  }
}