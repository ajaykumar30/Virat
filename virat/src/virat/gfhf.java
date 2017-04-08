package virat;

import org.testng.annotations.Test;

public class gfhf {
@Test
	public static  void main(){
	String str="ajay 3kumar";
	String i=str.replaceFirst(".*?(\\d+).*", "$1");
	
	System.out.println(i);

	}

}
