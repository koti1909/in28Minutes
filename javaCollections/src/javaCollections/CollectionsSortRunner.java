package javaCollections;

import java.util.*;

class AscendingStudentComparator implements Comparator<CollectionsStudent>{

	@Override
	public int compare(CollectionsStudent student1, CollectionsStudent student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}

	
	
}

public class CollectionsSortRunner {

	public static void main(String[] args) {
		
		List<CollectionsStudent> students = List.of(new CollectionsStudent(211,"paruchuri"), new CollectionsStudent(1,"koti"), new CollectionsStudent(111,"manikanta"), new CollectionsStudent(12,"sai"));
		
		List<CollectionsStudent> studentAL = new ArrayList<>(students);
		
		System.out.println(studentAL);
		
		Collections.sort(studentAL);
		
		System.out.println("DescendingStudentComparator" + studentAL);
		
		Collections.sort(studentAL, new AscendingStudentComparator());
		
		System.out.println("AscendingStudentComparator" + studentAL);

	}

}
