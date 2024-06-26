package javaCollectionsSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		List<Character> characters = List.of('A','B','X','A','E','G','Y','Y','M');
		
		System.out.println(characters);
		
		Set<Character> hashset = new HashSet<>(characters);
		
		System.out.println(hashset);
		
		Set<Character> linkedhashset = new LinkedHashSet<>(characters);
		
		System.out.println(linkedhashset);
		
		Set<Character> treeset = new TreeSet<>(characters);
		System.out.println(treeset);
		

	}

}
