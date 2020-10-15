package aaa;

import java.util.HashSet;
import java.util.Set;

public class Stringsend {

	public static void main(String[] args) {
		String f = f("hdi","hfido");
		System.out.println(f);
	}
	static String f(String str1,String str2) {
		String str3 ="";
		if(str1.equals(str2)) {
			str3 ="NA";
		}else {
			Set set=new HashSet<String>();
			for(int i = 0;i<str1.length();i++) {
				
				set.add(str1.charAt(i));
			}
//			System.out.println(set);
			
			for(int i =0;i<str2.length();i++) {
				int size = set.size();
				set.add(str2.charAt(i));
				if(set.size()!=size) {
//					System.out.println(str2.charAt(i));
					String string = Character.toString(str2.charAt(i));
//					System.out.println(string);
					str3 = str3.concat(string);
					
				}
			}
//			System.out.println(str3);
		}
		return str3;
		
	}
}
