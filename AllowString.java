package a.b.util;

public class AllowString {
	
	public String checkAllowString(String value){

	      value = value.replaceAll("<", "");                   
	      value = value.replaceAll(">", "");                   
	      value = value.replaceAll("\\|", "");                     
	      value = value.replaceAll("\\$", "");                     
	      value = value.replaceAll("\\%", "");                     
	      value = value.replaceAll("\\@", "");                     
	      value = value.replaceAll("\\+", "");                     
	      value = value.replaceAll("\\-", "");                     
	      value = value.replaceAll("\\!", "");                     
	      value = value.replaceAll("\\*", "");                     
	      value = value.replaceAll("\\\\", "");                    
	      value = value.replaceAll("\\#", "");                     
	      value = value.replaceAll("\\'", "");
	      value = value.replaceAll("\\=", "");
	                                                               
	      value = value.replaceAll("(?i)javascript", "");           
	      value = value.replaceAll("(?i)script", "");               
	      value = value.replaceAll("(?i)expression", "");          
	      value = value.replaceAll("(?i)background", "");          
	      value = value.replaceAll("(?i)alert", "");
	      value = value.replaceAll("(?i)document", "");
	      value = value.replaceAll("(?i)cookie", "");

	     

	    return value;

	       }
	

}
