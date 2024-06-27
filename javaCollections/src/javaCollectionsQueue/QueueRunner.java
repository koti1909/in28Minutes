package javaCollectionsQueue;

import java.util.*;
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String word1, String word2) {
		// TODO Auto-generated method stub
		return Integer.compare(word1.length(), word2.length());
	}


}

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		
		queue.addAll(List.of("Apple","Donkey","Giraffe","Elephant","Zebra","Monkey"));
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		

	}

}
