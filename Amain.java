class A {
	int a = 10;
	int b = 30;
	void display() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}


class Amain {
	public static void main(String args[]) {
		String a[] = {"Hello", "World"}; //creating a string array to pass as argument to main;
		A obj = new A(); //instantiating for class A
		
		Amain Am = new Amain(); //instantiating for class Amain
		obj.display(); //calling display method for class A
		Am.main(a); //recursive call?? whether it will loop?
		System.out.println(args[0]);  //value of args[0]
	}
}