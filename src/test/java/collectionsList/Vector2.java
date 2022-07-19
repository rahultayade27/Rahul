package collectionsList;

import java.util.ListIterator;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1000);
		v.add(2000);
		v.add(3000);
		v.add(4000);
		ListIterator li=v.listIterator();
		while(li.hasNext())
		{System.out.println(li.next());
		}
		}
	

	}


