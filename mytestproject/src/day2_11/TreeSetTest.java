package day2_11;

import java.util.HashSet;

public class TreeSetTest {
	public static void main(String[] args) {
		HashSet<Person> hset=new HashSet<>();
		Person p1 = new Person("12", 12);
		Person p2 = new Person("12", 12);
		Person p3 = new Person("11", 14);
		Person p4 = new Person("11", 13);
		hset.add(p1);
		hset.add(p2);
		hset.add(p3);
		hset.add(p4);
		for (Person person : hset) {
			System.out.println(person);
		}
		
	
	}
}
