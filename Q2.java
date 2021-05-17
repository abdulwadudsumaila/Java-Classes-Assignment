package objects_class;
   // program to calculate area and parameter of triangle
  // using Heron's Formula; area = √s(s-a)(s-b)(s-c)
  // where s => semi-parameter = a + b + c / 2
  // Parameter of the triangle  = a + b + c
 class Triangle{
	 int a, b, c, p;
	 public double area(){
	 double s = a + b + c / 2.0;
	 return Math.pow((s*(s-a)*(s-b)*(s-c)), .5);
	 }
	 
	 public int parameter() {
		 return  p = a + b + c;
	 }
 }
public class Q2 {
	public static void main(String[] args){
		Triangle t = new Triangle();
		t.a = 3;
		t.b = 4;
		t.c = 5;
		System.out.println( t.area());
		System.out.println(t.parameter());
	}

}
