package assignments;

public class StrDigit {
	 public static void main(String[] args) {
	        String str = "1234";
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
	                System.out.println("Doesnot contains only digits");
	            }
	            
	        }System.out.println("Contains only digits");
	       
}
}

