class ExampleStatic1 {
	static int a=10;
	void display_a() {
		System.out.println("a value: "+a);
	}
	
	//static block, will be executed before main, once
	static{System.out.println("Inside static block"); a =20;}
	
	ExampleStatic1 () {
		a++;
	}
	
	
	public staticvoid main(String args[]) {
		ExampleStatic1 es1 = new ExampleStatic1();
		es1.display_a(); // 21
		ExampleStatic1 es2 = new ExampleStatic1();
		es2.display_a(); //22
	}