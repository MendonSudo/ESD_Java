class P{
	public static void main(String args[]) {
		System.out.println("Inside P");
		main(10);
	}
	public static void main(int a) {
		System.out.println("Inside P1");
	}
}

class Q{
	public static void main(String args[]) {
		System.out.println("Inside Q");
	}
}

class R{
	public static void main(String args[]) {
		System.out.println("Inside R");
	}
}