/* To illusrate the static method */

class ExampleStatic {
	static void display(int x,int y) {
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}
	
	public static void main(String args[]) {
		int x = 10;
		int y = 20;
		//ExampleStatic es = new ExampleStatic();
		display(x,y);
	}
}