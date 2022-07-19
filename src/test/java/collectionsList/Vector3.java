package collectionsList;

import java.util.ListIterator;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add('A');
		v.add('B');
		v.add('C');
		v.add('D');
	System.out.println(v);
		ListIterator li=v.listIterator();
		while(li.hasNext());
		System.out.println(li.next());
		
		
		

	}

}
