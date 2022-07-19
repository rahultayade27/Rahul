package collectionsList;

import java.util.ArrayList;

public class arrayList1 {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		A1.add(new emp(101,"R"));
		A1.add(new emp(202,"B"));
		A1.add(new emp(303,"C"));
		for(Object o:A1)
		{ emp e=(emp)o;
		System.out.println(e.empId+" - "+e.empName);
		

	}
	}
}
