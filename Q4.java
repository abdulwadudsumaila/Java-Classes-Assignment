package objects_class;
import java.util.*;
class Area{
	  int length;
	  int breadth;
	  public Area(int l, int b){
	    length = l;
	    breadth = b;
	  }
	  public int area(){
	    return length*breadth;
	  }
	}
public class Q4 {
	  public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    int l,b;

	    System.out.println("Please enter the length of the rectangle");
	    l = input.nextInt();
	    System.out.println("Please enter the breadth of the rectangle");
	    b = input.nextInt();

	    Area a = new Area(l,b);
	    System.out.println("Area of the rectangle is "+a.area());
	  }
	}		
