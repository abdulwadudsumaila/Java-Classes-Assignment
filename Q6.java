package objects_class;
class Room{
	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	
	void setData(int rno, String rt, float area, boolean ac) {
		roomNo = rno;
		roomType = rt;
		roomArea = area;
		acMachine = ac;
	}
	
	void display() {
		System.out.print("The room number is " +roomNo);
		System.out.print("The room type is " +roomType);
		System.out.print("The room area is " +roomArea);
		String s = (acMachine)? "Yes" : "No";
		System.out.print("The ac Machine is needed" +s);
	}
}
public class Q6 {
public static void main(String[] arg) {
	Room room1 = new Room();
	room1.setData(100, "singleRoom", 78.0f, true);
 }
}
