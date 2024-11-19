public class practice_set {

	public static void main(String[] args) {
		//question 2
		String a = "aditya patel" ;
		System.out.println(a.replace(" ","_"));
		
		//question 3
		String b = "aditya";
		System.out.println("letter : "+" Dear "+ b +" thanks a lot ");
		
		String letter = "Dear <|name|> , thanks a lot";
		System.out.println(letter.replace("<|name|>",b));
		
		//question 4
		String str="this string contains  double and   triple spaces ";
		System.out.println(str.indexOf("  "));
		System.out.println(str.indexOf("   "));
		
		//question 5
		System.out.println("\"Dear Harry,\n\tThis java course is nice.\n\tthanks !\"");
	}
}
