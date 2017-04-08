package virat;

abstract class ex
{
	   abstract void run();
	 }

	 class Honda4 extends ex{
	 void run(){System.out.println("running safely..");}

	 public static void main(String args[]){
	  ex obj = new Honda4();
	  obj.run();
	 }
	 }