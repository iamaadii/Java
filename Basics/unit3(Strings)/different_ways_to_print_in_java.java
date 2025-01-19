class different_ways_to_print_in_java {
	public static void main(String[] args) {
		String name ="harry";
		System.out.print("my name is : "); //1
		System.out.println(name);	//2
		int a=3;
		System.out.printf("value of a is %d\n",a); //3
		System.out.format("value of a is %d\n",a); //4
		
		float b = 5.6454f;
		System.out.printf("value of b is %f\n",b);
		System.out.printf("value of b is %.2f\n",b);
		System.out.printf("value of b is %8.2f\n",b);
		System.out.printf("value of b is %8f\n",b);
	}
}
