package lin;

import java.util.Scanner;

public class Exe_3 {
public static void add(int [] numbers) {
	int s=0;
	for(int i=0;i<numbers.length;i++){
		s+=numbers[i];		
	}
	System.out.println("����ĺ��ǣ�"+s);
	
}
public static void Print(int [] numbers) {
	System.out.println("�������Ԫ����:");
	for(int i=0;i<numbers.length;i++){
	System.out.println(numbers[i]+",");
	}
}

public static void max(int []numbers) {
	
     int Max=numbers[0];
	int Min=numbers[0];
	for( int i=1;i<numbers.length;i++){
	
		if (numbers[i]>Max) {
			Max=numbers[i];
	}
		if (numbers[i]<Min) {
			Min=numbers[i];
	}
	}
	System.out.println("���������ֵΪ��"+Max+"");

System.out.println("��������СֵΪ��"+Min+"");

}

public static void  guestNumber(int []numbers) {
	System.out.println("������һ������");
	boolean flag=false;
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	for(int i=0;i<numbers.length;i++){
		if (number==numbers[i]) {
			flag=true;
			break;
		}
	}
		if (flag) {
			System.out.println(number+"���������֮��");
		}    
		
		else {
			System.out.println("����������");
		} {
			
		}
	
	
}
public static void main(String[]args) {
	int[] numbers={8,4,2,1,23,344,12};	
	Print(numbers);
	max(numbers);
	add(numbers);
	guestNumber(numbers);
	
	
}





}
