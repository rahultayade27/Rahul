package collectionsList;

import java.util.ArrayList;

public class collage {

	public static void main(String[] args) {
		ArrayList<Student> Stud=new ArrayList<Student>();
		Stud.add(new Student("Priya",100,'A'));
		Stud.add(new Student("Rutu",200,'B'));
		Stud.add(new Student("Pooja",300,'C'));
		Stud.add(new Student("Aditi",400,'D'));
		for(Student S:Stud)
		{
			System.out.println(S.StudentName+" - "+S.StudentId+" - "+S.StudentGrade);
		}
			
		
      


	}

}
