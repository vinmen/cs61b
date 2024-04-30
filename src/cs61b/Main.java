package cs61b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(1);	
		l.add(null);		
		
		Map<String, String> m = new HashMap<>();
		m.put("a", "abc");	
		
		Set<String> s = new HashSet<>();
		s.add("abc");	
		s.add(null);
		
		System.out.println("Hello");
	}
}
