import java.util.HashMap;
import java.util.Map;

public class NumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Football";
		String s1=s.toLowerCase();
		
		Map<Character, Integer> m=new HashMap<>();
		
		//for (int i = 0; i < s1.length(); i++) {
		for (Character ch : s1.toCharArray()) {

			if (m.get(ch) == null) {
				m.put(ch, 1);
			} else {
				m.put(ch, m.get(ch) + 1);
			}

		}
		System.out.println("map is"+m);
		m.forEach((key, value) ->{
			System.out.println(key+ " key occured "+ value);
		});
		//for (String string : m) {
			//System.out.println("character "+ch+" occurered this many times...>>>"+i);
			
		}

	}


