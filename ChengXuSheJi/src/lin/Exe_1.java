package lin;

public class Exe_1 {
	
	public static void PrintStar(int row){
	int i,j;
		for(i=0;i<row;i++){
			
			for(j=0;j<=i;j++){
				System.out.println("*");	
			}
			System.out.println();
			
		}
		System.out.println();
	
	}
	
	public static void main(String[] args) {
		System.out.println("�����ӡ��һ�������Σ�");
	 PrintStar(3);
	 System.out.println("�����ӡ�ڶ��������Σ�");
	 PrintStar(4);
	 System.out.println("�����ӡ�ڶ��������Σ�");
	 PrintStar(5);
	}
}
