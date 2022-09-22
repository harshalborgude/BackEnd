package org.hrb.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// The queue is a data structure that First in First Out(FIFO) structure.
// LinkedBlockingQueue
// LinkedBlockingQueue is of dynamic size. It’s not required to provide size while creating LinkedBlockingQueue.
// add() method is used to add data at the end of the queue
// ArrayBlockingQueue 
// Like Arrays, ArrayBlockingQueue is of fixed size.
// Size of ArrayBlockingQueue should be provided as arguments while creating a queue.
// add() method is used to add data at the end of the queue.
// When the size of the queue is exceeded, it throws IllegalStateException.
// remove()  method removes the first element of the queue. If we try to remove an element from an empty queue, it throws NoSuchElementException.
// element() method returns the first element of the queue. . If we try to examine any empty queue, it throws NoSuchElementException.
// offer() is a special method used for adding data into a queue, which returns true if data is successfully added into a queue and false if data is not added.
// poll()  is a special method that removes the first element of the queue and returns the element which is removed from the queue. If we try to poll any element from an empty queue, it returns null.
// peek() is also a special method that checks for the first element of the queue. It returns null if implemented on an empty queue.


public class QueueMap {

	public static void main(String[] args) {
		
		// LinkedBlockingQueue
		Queue<Integer> queue = new LinkedBlockingQueue<>();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.offer(6); // will return true and false
			
		for(Integer element: queue){
			System.out.println(element);
		}
		
		// ArrayBlockingQueue
		Queue<Integer> arrayQueue = new ArrayBlockingQueue<>(6);
		arrayQueue.add(1);
		arrayQueue.add(2);
		arrayQueue.add(3);
		arrayQueue.add(4);
		arrayQueue.add(5);
		arrayQueue.add(6);
		
	for(Integer element: arrayQueue){
		System.out.println(element);
	}
		
	}
	
}
