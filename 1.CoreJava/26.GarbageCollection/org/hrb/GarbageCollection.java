package org.hrb;

/*
1) Garbage Collector : Is process to clean old object and memory space which is not reachable.
2) Garbage collector Follow 3 steps : mark , Delete / Sweep , Compacting
3) In marking it will start from root object will mark all the objects which are live.Whatever unreachable objects are there they will be Sweeped out
   And Then whatever holes will be created in memory bcz of sweeping dead objects , so it will be allocated by filling those holes called compacting.
4) There are 2 types of Spaces in Heap 1) Young Generation and 2) Old Generation.
 	- Young generation consist of newly created objects , In young generation Eden space is there where new objects are created always.
 	- Meantime after some time when Eden space is about to full , minor garbage collection cycle will trigger and will sweep all unreachable objects
 	- and will move all living objects to survivor space1 , and again new objects will be created in Eden Space.
 	- When Eden space is again about to full then minor GC process will again start on both spaces and will delete all the unreachable objects from
 	- both Eden and survivor spaces. And again allocated all the living objects in survivor space 2 .
 	- This will going on untill a threshould occures for minor GC cycles , Then it will trigger Major Garbage Collection Cycle.
 	- In Major Garbage Collection cycle , It will Sweep all the unreachable objects from all the Eden and survivor spaces and will move all then
 	- living objects to Old Generation Space.
5) There are 3 types of Garbage collectors , 1) Serial collector , 2) concurrent collector , 3) parallel collector
6) Serial Collectors - Basic garbage collector that run in single thread , it will pause application and will run, can be used for basic applications.
7) Concurrent collector - performs GC along with application execution , It doesn't wait for old generation to be full, Stops the app only during marking.
8) Parallel collector - Uses multiple CPUs to perform GC , Multiple thread doing mark,sweep,compacting , will not kick in untill heap is full/about to full ,
  	It stops the whole application for some time when it runs.

*/
public class GarbageCollection {

	public static void main(String[] args) {
		
		// will start garbage collection
		System.gc();		

	}	

}
