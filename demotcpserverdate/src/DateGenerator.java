import java.util.Date;

/**
 * This class generates date.
 * 
 * @author emalianakasmuri
 *
 */
public class DateGenerator {

	
	/**
	 * This method generates current date.
	 * 
	 * @return current date
	 */
	public String getCurrentDate() {
		
		//String currentDate = new Date().toString();
		
		//return currentDate;
		
		
		
		//Create a word for server to count
		
		String text1 = "Hello World";
		String lengthText = String.valueOf(count(text1));
		
		return lengthText;
	}
	
	public static int count(String text1){
		
		if(text1 == null || text1.isEmpty())
		{
			return 0;
		}
		
		String[] words = text1.split("\\s+");
		
		return words.length;
	}
	
}
