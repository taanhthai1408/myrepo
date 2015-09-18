package khtn.edu.ut;

import khtn.edu.tooldex;
import khtn.edu.toyoungex;

public class exut {
	public static void checkage(int age) throws toyoungex,tooldex{
		if(age < 18){
			throw new toyoungex("Age " + age +" is to yoang" );
		}
		if(age > 60){
			throw new tooldex("Age " + age +" is to old" );
		}
	}
}
