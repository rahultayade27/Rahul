package collectionsList;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
	ArrayList A1=new ArrayList();
	A1.add(1000);
	A1.add(200.5f);
	A1.add("ABCD");
	A1.add(false);
	A1.add('R');
	System.out.println(A1);
    A1.add("Software");
    A1.add("Testing");
    System.out.println(A1);
    System.out.println(A1.contains("ABCD"));//return type boolean
    System.out.println(A1.isEmpty());//returen type boolean
    System.out.println(A1.size());
    A1.clear();
    System.out.println(A1.isEmpty());
   
	}

}
