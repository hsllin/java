package lin;

public class Exe_4 {

public static void doCompute(Student student) {
	student.getMax();
	student.getMin();
	student.getAverage();
	student.getSum();


}

public static void main(String[]args) {

  Student student=new Student(80,81,82);
   doCompute(student);
	
}
	
	
	
}
