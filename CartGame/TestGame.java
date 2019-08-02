package CartGame;
import java.util.Arrays;
import java.util.Random;
public class TestGame {
	static Card[] deck=new Card[52];
	public static void creadCard(){
		String [] f={"A","2","3","4","5","6",
				          "7","8","9","10","J","Q","K"};
		String[] s={"黑桃","红桃","梅花","方块"};
		int index = 0;
		
		for(int i=0;i<f.length;i++){
			for(int j=0;j<s.length;j++){
				Card c=new Card(f[i],s[j],4*i+j);
				deck[index++]=c;
			}
		}
	}
	
	public static void paixu(Card[] num){
		int numindex=0;
		int[] arr=new int[num.length];
		for(int i=0;i<num.length;i++){
			arr[numindex++]=num[i].getIndex();
		}
		Card[] c=new Card[num.length];
		int ls=0;
		for(int i=0;i<arr.length;i++){
			//取比较值下标
			ls=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]<arr[i]){
					ls++;					
				}
			}
			c[ls]=num[i];			
		}
		for(int i=0;i<num.length;i++){
			num[i]=c[i];
		}	
	}
	public static void RandomCard(Card[] deck){
		Random ran=new Random();
		for(int i=0;i<100;i++){
			int num1=ran.nextInt(52);
			int num2=ran.nextInt(52);
			Card temp=deck[num1];
			deck[num1]=deck[num2];
			deck[num2]=temp;
		}
	}
	public static void showCard(){
		for(int k=0;k<deck.length;k++){
			Card c=deck[k];
			System.out.println(c.toString());
		}
	}
	public static void readyplay(){
		Card[] num=new Card[5];
		
		Card[] num1=new Card[5];
		Card[] num2=new Card[5];
		int numindex=0;
		int num1index=0;
		int num2index=0;
		
		for(int i=0;i<10;i++){
			if(i%2==0){
				num1[num1index++]=deck[i];
			}else{
				num2[num2index++]=deck[i];
			}
		}
		paixu(num1);
		paixu(num2);
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}
 public void isSuccess(Card[] num1,Card[] num2){
		 
		 
	 }
 public static void main(String[] args) {
		creadCard();
	    // 洗牌
	    RandomCard(deck);
	  
	    showCard();
	    // 玩牌
	    readyplay();

}
}