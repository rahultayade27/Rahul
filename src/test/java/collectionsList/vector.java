package collectionsList;

import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		System.out.println(v);
	Iterator i=v.iterator();
	while(i.hasNext())
	{ Integer ii=(Integer)i.next();
     System.out.println(ii);
	}
	}
}


