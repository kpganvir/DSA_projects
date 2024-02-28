package demo.examples.streamapi;

public class StringOthers {

	public static void main(String args[])
	{
		
		  
	       String s1="listen";

	String s2="silent";

	String s3="Hello";
	String s4="LLoHeu";

	 System.out.println("s1 & s2 ? "+ findAnagramStrings2(s1,s2));
	 
	 System.out.println("s3 & s4 ? "+ findAnagramStrings2(s3,s4));
		
	}
	
	  static boolean findAnagramStrings(String s1,String s2)
	  {
		  if(s1 ==null && s2 ==null) return false;
		  if(s1.length()!=s2.length()) return false;
		  
		  
	    
	    	s1=s1.toLowerCase();
	    	   s2=s2.toLowerCase();
		     int loop=0;
	    	 while(loop< s1.length())
	    	 {
	    		  if(s2.contains(String.valueOf(s1.charAt(loop))))
				    {
						loop++;
					}
	    		  else 
	    			  return false;
					
			
	    	  }
			     
				    
			return true;
					  
	  
	  }

	  
	  static boolean findAnagramStrings2(String s1, String s2) {
		    if (s1 == null && s2 == null) return false;
		    if (s1.length() != s2.length()) return false;

		    s1 = s1.toLowerCase();
		    s2 = s2.toLowerCase();

		    for (int i = 0; i < s1.length(); i++) {
		        if (s2.contains(String.valueOf(s1.charAt(i)))) {
		            continue;
		        } else {
		            return false;
		        }
		    }

		    return true;
		}
}
