package classwork;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		ArrayList <String> obj = new ArrayList<String>();
		obj.add("Abitha");
		obj.add("Akhil");
		obj.add("Suresh");
		obj.add("Syamala");
		
		System.out.println(obj);
		
		 System.out.println("size:"+obj.size());
		 
		 //adding
		 
		obj.add(2,"pendela");
		System.out.println(obj);
		
		//setting 
		obj.set(2,"replaced");
		System.out.println(obj);
		
		//indexof
		
		System.out.println(obj.indexOf("replaced"));
		System.out.println(obj.indexOf("pendela"));
		
		//getting obj
		
		String st = obj.get(4);
		System.out.println(st);
		
		//contains  ---> if obj existed true else false
		
		System.out.println(obj.contains("pendela"));
		
		//remove objs  two ways
		
		obj.remove(2);
		System.out.println(obj);
		obj.remove("Abitha");
		System.out.println(obj);
		
		//iterating list
		for(String s:obj) {
			System.out.println(s);
		}
		
		//sortinglist
		
		Collections.sort(obj);
		System.out.println(obj);
		
		//whether the objs of one list contains in another list
		
		
	}

}
