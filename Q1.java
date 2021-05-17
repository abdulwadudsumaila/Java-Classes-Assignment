package objects_class;

class Student{
	String name = "John";
	int roll_no = 2;
}
public class Q1 {
   public static void main(String[] args) {
	   Student S = new Student();
	   Student no = new Student();
	   System.out.println(S.name+ " roll number is "+no.roll_no);
   }
}
