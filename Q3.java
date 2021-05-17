package objects_class;
 class  Rectangle{
	 int length;
	 int breadth;
	 public Rectangle(int l, int b) {
		 length = l;
		 breadth = b;
	 }
	 public int area() {
		 return length * breadth;
	 }
	 public int parameter() {
		 return 2 * (length * breadth);
	 }
 }
public class Q3 {
  public static void main(String[] args) {
	  Rectangle first = new Rectangle(4,5);
	  Rectangle second = new Rectangle(5,8);
	  System.out.println("The area of the first rectangle is " +first.area()+ " and the parameter is "+first.parameter() );
	  System.out.println("The area of the second rectangle is " +second.area()+ " and the parameter is "+second.parameter() );
  }
}
