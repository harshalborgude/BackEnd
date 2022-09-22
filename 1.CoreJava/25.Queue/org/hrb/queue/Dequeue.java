package org.hrb.queue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

// This means a DOUBLE ENDED QUEUE.
// The double-ended queue means insertion and deletion can take place from both ends.
// all the Queue methods can be used with Deque, but Deque has its own methods which allow to add and remove elements at the beginning and end of Deque.
// addfirst() , removelast() , offerFirst() , pollFirst()

public class Dequeue {
	
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		
	
			deque.offer(1);
			deque.offer(2);
			deque.offer(3);
			deque.offer(4);
			deque.offer(5);
			deque.offer(6);
			deque.offer(7);
		
		for(Integer element: deque){
			System.out.println(element);
		}
		System.out.println("********************");
		deque.addFirst(0);
		deque.removeLast();
		
		for(Integer element: deque){
			System.out.println(element);
		}
		
		
	}
	

}
