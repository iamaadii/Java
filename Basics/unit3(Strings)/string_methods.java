public class string_methods {

	public static void main(String[] args) {
		String a = "pRoGraMinG";
		
		System.out.println(a.length()); //1
		
		System.out.println(a.toLowerCase()); //2
		
		System.out.println(a.toUpperCase());  //3
		
		System.out.println(a.substring(1));  //4
		
		System.out.println(a.substring(3,8));  //5
		
		System.out.println(a.replace('p','P'));  //6
		System.out.println(a.replace("pRoGraMinG","programing"));
		System.out.println(a.replace("G","abc"));
		
		System.out.println(a.startsWith("p"));  //7
		System.out.println(a.startsWith("pRo"));
		System.out.println(a.startsWith("f"));
		
		System.out.println(a.endsWith("G")); //8
		
		System.out.println(a.charAt(7)); //9
		
		System.out.println(a.indexOf('G')); //10
		System.out.println(a.indexOf('q'));
		
		String name = "harryrry";
		System.out.println(name.indexOf("rry",4));
	
		System.out.println(name.lastIndexOf("y")); //11
		System.out.println(name.lastIndexOf("rry"));
		System.out.println(name.lastIndexOf("py"));
		System.out.println(name.lastIndexOf("yar"));
		System.out.println(name.lastIndexOf("rry",4));
		System.out.println(name.lastIndexOf("y",4));
		
		System.out.println(a.equals("pRoGraMinG")); //12
		System.out.println(a.equals("proGraMinG"));
		System.out.println(a.equalsIgnoreCase("programing"));
		
		String b = "     java      "; //13
		System.out.println(b.trim());  
		System.out.println(b);
		
		
	}

}
  