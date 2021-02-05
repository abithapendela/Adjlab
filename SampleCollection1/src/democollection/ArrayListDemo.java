package democollection;

import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList <Student> stlist = new ArrayList<Student>();
		Student st = new Student();
		st.setName("Abita");
		st.setRegdno("18b01a1282");
		st.setBranch("it");
		stlist.add(st);
		
		Student st1 = new Student();
		st.setName("harika");
		st.setRegdno("18b01a000");
		st.setBranch("cse");
		stlist.add(st1);
		
		System.out.println(stlist.size());
		
		for (int i = 0;i < stlist.size();i++) {
			Student st3 = stlist.get(i);
			System.out.println(st3.getRegdno());
		}
	}
}
