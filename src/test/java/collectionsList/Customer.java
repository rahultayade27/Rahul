package collectionsList;

import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
		ArrayList<Inox>Tic=new ArrayList<Inox>();
		Tic.add(new Inox(1,"Avenger","A-202"));
		Tic.add(new Inox(2,"Captain America","A-203"));
		Tic.add(new Inox(3,"Thor","A-204"));
		for(Inox T1:Tic)
	 {  System.out.println(T1.ScreenNumber+"-"+T1.MovieName+"-"+T1.SeatNumber);

	}

	}
}
