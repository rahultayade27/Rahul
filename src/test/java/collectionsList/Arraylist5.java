package collectionsList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist5 {

	public static void main(String[] args) {
		ArrayList<String> A1=new ArrayList<String>();
		A1.add("A");
		A1.add("B");
		A1.add("C");
		A1.add("D");
		System.out.println(A1);
		//Normal Cursor
		Iterator i1=A1.iterator();
		while(i1.hasNext())
		{String S=(String)i1.next();
		System.out.println(S);
		}
		//Generic Cursor
		Iterator<String> i2=A1.iterator();
		while(i2.hasNext());
		{
		System.out.println(i2.next());

	}

}
}
