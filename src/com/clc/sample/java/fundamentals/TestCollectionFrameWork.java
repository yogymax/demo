package com.clc.sample.java.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

//this is test line---
public class TestCollectionFrameWork {
	//one more change in other file
	//generics -- 
	//<Integer>
	// <? extends X > -- upper bound
	//<? super X> -- lower bound
	//<?> -- null -- raw type
	//List -- generics -- any object
	
	/*T -- Type
	E -- Element
	K - Key
	V - value*/
	
	
	
	//<> -- inference -- 1.7 not mandatory -- 
	
	/**
	 * 
	 * Collection Framework = Collection + map
	 * 		1.Only Objects
	 * 		2.DS
	 * 		3.Growable
	 * 		4.Homogenous + Hetrogenous
	 * Collection
	 * 	List
	 * 			Duplicates allowed
	 * 			Seq Maintained
	 * 			Null Insertion allowed
	 * 			
	 * 		ArrayList
	 * 				Default capacity 10
	 * 
	 * @param arg
	 */
	
	
	//List to Array -- Collection.toArray()
	//Array to List -- Arrays.asList(arrayOb);
	public static void main(String [] arg) {
		
		
		Integer[] nums = {10,2,34,5,6};//Array
		List<Integer> list = Arrays.asList(nums);
		List<Integer> numbers = new LinkedList(list); //10
		for(int i=1;i<=15;i++)
			numbers.add(i);
		
		
		System.out.println(numbers);
		
		System.out.println("using for loop");
		for(int i=0;i<numbers.size();i++)
			System.out.print(numbers.get(i) +" , ");
		
		System.out.println("using for each..");
		for(Integer item : numbers)
			System.out.print(item +" , ");
		
		
		System.out.println("Using iterator");
		//Iterator is class from java.util
															//iterator() -- is a method from Iterable Interaface from Java.lang package which returns Iterator type of object of java.util
		Iterator<Integer> numItr = numbers.iterator(); 
		while(numItr.hasNext()){
			System.out.print(numItr.next() +" , ");
		}
		
		//Iterator will work on all collection implemented class but will not work on map 
		

		System.out.println("using list iterator");
		ListIterator<Integer> numListItr = numbers.listIterator(); 
		while(numListItr.hasNext()){
			System.out.print(numListItr.next() +" , ");
		}
		
		//ListIterator will work only on List Implemented Classes not on set or queue or Map
		
		
		Vector<Integer> vector = new Vector<>(numbers);
		
		System.out.println("using Enumeration");
		Enumeration<Integer> enumrator = vector.elements();
		while(enumrator.hasMoreElements()){
			System.out.print(enumrator.nextElement() +" , ");
		}
				

		
		
/*		
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(10);
*/		
		/*
		System.out.println(numbers);//1--10
		System.out.println(numbers.size());//10
		System.out.println(numbers.isEmpty());//false
		System.out.println(numbers.contains(7));//true
		System.out.println(numbers.contains(70)); //false
		System.out.println(numbers.remove(new Integer(10)));//remove(val) -- index remove , remove (Obj) -- collection remove(Object)
		System.out.println(numbers.containsAll(list));//1--10
		System.out.println(numbers.removeAll(list));// numbers will have all those elements except list
		System.out.println(numbers.retainAll(list));// numbers will have only those elements present inside list , others will be removed
*/		
	}

}



/**

		List num1 = new ArrayList<>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		
		List num2 = new ArrayList<>();
		num2.add(10);
		num2.add(20);
		num2.add(30);
		
		List num4 = new ArrayList<>();
		num4.add(100);
		num4.add(200);
		num4.add(300);
		
		List num3 = new ArrayList<>(num4);
		num3.add(num1);
					num3.addAll(num2);
		
		System.out.println(num3);

		
		
Iterator iterator() -- method from Iterable interface -- java.lang

Iterator class -- java util



	Iterator 		-- ListIterator -- 		Enumeration
	
	iterable.iterator()  list.listiterator()	legacycls.elements()
	
	Forward	Direction	Both Direction		Forward
	hasnext				hasnext				hasMoreElements
	next				next				nextElement
	remove				remove
						hasPrevious
						previous
						previousIndex
						nextIndex
						add
						set
						
	can read 			read/remove/add		only read
	and remove			modify
	
	Only collection		Only on List 			Only on Legacy classes
	Implemented classes	implemented classes	  stack/vector/hashtable/prop/dict
	
		
		
		
*/

