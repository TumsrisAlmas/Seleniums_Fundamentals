package Group_3;

import java.util.*;

class D implements ii{
	
}

interface ii{
	 ii obj=new D();
	int z=100;
	
//	abstract void method1();
	
	public static void J() { 
	
	}
	
	//	public void method2();
		

	
	
}

 abstract class zz{
	// zz obj=new zz();
	
	abstract public String mm();
	private zz() {
		
	}
	static int y=100;
}

public class JavaReviews {
			
	public static void main(String[] args) throws Exception {
		Thread.sleep(3000);
		
		zz.y=300;
		/*
		 		Java Topics: Collections, Maps, OOP, Exception.
		 		
		 		1. Collection(I) :  extended by List(I), Set(I), Queue(I)
		 				1. List(I):  implemented by  ArrayList(C), LinkedList(C) (Fastest), Vector(C) (slowest)
		 						List accepts duplicates, it has index.
		 						
		 						Collections.sort( listname ).    Arrays.sort(ArrayName)
		 						
		 				2. Set(Interface):  Extended by SortedSet(I, implemented By TreeSet).
		 								implemnted by HashSet, LinkedHashSet.
		 									
		 						Set it does not take duplicates, it desont have index.
		 
		 		All collections are iterable.
		 		
		 				3. Queue(I): extended by DeQue 
		 							implemnted by priorityQue,  LInkedList.
		 
		 					does accept duplicates, it does not have index num
		 					
		 					
		 		2. Maps<Key, Value> (I) : implemnted By HashMap(C), LinkedHashMap(C), HashTable(C).
		 					  extended by SortedMap(I, implemnted by TreeMap.)
		 			Key cannot be duplicated.
		 		
		 		differences between hashtable and hashmap: HashMap accepts null, HashTable does not. 
		 													hashtable is snchronized (slower), hashmap is not.
		 													
		 					sortedmap only sorts the Key.
		 					
		 					
		 		3. OOP: Encapsulation, Abstraction, Inheritance, Polymorphisim.
		 				0. final:  
		 						1. final variable cannot be modified (instance variables must be initilized). 
		 						2. final classes cannot be extended, abstract class and interface cannot be final.
		 						3. final method cannot be override
		 						
		 				1. Encapsulation: hiding the data, grants other class or objects get access to private data through getter and setter.
		 						getter: return method, it returns the private data. Read Only.
		 						setter: void method, passes a parameter and initilize it to the private data.
		 					
		 				2. Abstraction: hiding the implemntation details. 
		 						abstract methdod :  abstract public void method();, meant to be override (same method. same parameter). 
		 							restrictions of abstract method: canno be , private, static, final, cannot have body. 
		 									Has to be decleared in Abstract class or interface.
		 									
		 						differences between Abstract class and interface: in interface none static methods by default are abstract.
		 														interface does not have constructor method.
		 														instance variables in interface are static and final by default.
		 														class can only extend one abstract class, but implemnet multiple interfaces.
		 
		 							abstarct class and interface they both cannot be final, cannot create object.
		 							
		 			  3. Inheritance: extends,  
		 			  			class A extyends class B
		 			  			(sub)				(super)
		 			  			
		 			  			A can call all members of B.
		 			  			B cannot call A' members
		 			  			
		 			 
		 			 4. Polymorphisim: 	objects behave in multiple forms.
		 			 		class A extends class B
		 			 		
		 			 		B obj=new A();
		 			 			reference decides what members can be called.
		 			 				obj.method1();    // always the override one will return.
		 			 
		 			 
		 			 Overload: same name, different parameter
		 			 				
		 			 				
		 			 				
		 	3. Exceptions: 
		 				1.  checked exceptions: compile time(gives compile erro, needs to be handled immidietly).	
		 				2. unchcked exception: runtime (exception only occures on runtime)
		 			 		
		 		Handling exceptions: try&catch  , throws  (method signature)
		 			 		
		 			 		throw creates exception' object
		 			 		
		 			 		
		 			
		 */
		//	throw new RuntimeException();
		
		try {
			int u = 9/0;   
			System.out.println("hello");    // try block won't execute if the exception is unchekd.
		}catch (Exception e) {
			System.out.println("World");    // catch block is only executed if the eception is unchecked
		}
		
		try {
		Thread.sleep(2000);
		System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block"); // catch block won't be executed if the exception is checked.
		}
		
		
		Queue<Integer> lis = new PriorityQueue<>();
		
		
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(12,13,10,10,10,10,10));
		       Collections.sort(list);
		       
		HashSet<Integer> st=new HashSet<>();
		
			st.addAll(list);
			System.out.println(st);
			
			
			
		
	}

}
