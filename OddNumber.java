class OddNumber {
	public static void main(String args[]) {
		int num = 0;
		int limit = 100;
		
		while(num < limit) {
			if(num % 2 !=0)
				System.out.println(num);
			num++;
		}
	}
}