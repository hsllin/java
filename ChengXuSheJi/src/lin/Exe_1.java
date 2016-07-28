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
		System.out.println("下面打印第一个三角形：");
	 PrintStar(3);
	 System.out.println("下面打印第二个三角形：");
	 PrintStar(4);
	 System.out.println("下面打印第二个三角形：");
	 PrintStar(5);
	}
}
