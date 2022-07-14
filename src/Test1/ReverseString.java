package Test1;

public class ReverseString {

	public static void main(String[] args) {
		
		   String str1 = "pune";
	       String str = "";
	        for(int i=str1.length()-1;i>=0;i--)
	        {
	            str= str+str1.charAt(i);
	        }

	        System.out.println(str); 
	    }
	

	}


