package MapInterface.Hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * Map uses a dictionary kind of structure
 * It has a key and a value
 * Helpful in creating login pages where username is the key and password is a value
 */

public class App {

	public static void main(String[] args) {
		
		
		// Not a right way to work with maps
		HashMap map1 = new HashMap();
		
		//using polymorphism is the right way
		Map<String,String> map = new HashMap<>();
		
		// <String,String> = <key,value>
		
		map.put("hairy", "potter123");
		map.put("ronald", "ronald123");
		map.put("hermoine", "hermoine123");
		
		System.out.println(map);//{hairy=potter123, ronald=roanld123, hermoine=hermoine123}
		
		/* Display all the keys of the map */
		
		System.out.println(" ");
		for(String key : map.keySet()) {
			System.out.print(key + " ");//hairy ronald hermoine 
			
		}
		
		
		/* Display all the values or passwords of the map */
		
		System.out.println(" ");
		for(String value : map.values()) {
			System.out.print(value + " ");//potter123 roanld123 hermoine123 
			
		}
		
		System.out.println(" ");
		
		
		/* Given the key fetch the value */
		
		
		String password = map.get("hermoine");
		System.out.println(password);
		
		/* Replace the value based on the key */
		
		// 2 ways
		map.replace("hairy", "puttar@123");
		
		// OR
		map.replace("ronald","ronald123", "ronald@123"); //given the old password to put in the new password
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
