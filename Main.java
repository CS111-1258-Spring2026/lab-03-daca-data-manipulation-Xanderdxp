// STUDENT NAME: Xander
// DATE: 3/1/26

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int y;
		int m;
		int a;
		int JDN;

		/***** INITIALIZATION SECTION *****/
		int year = 2020;
		int month = 2;
		int day = 2;
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)

		
		/***** CALCULATION & PROCESSING SECTION *****/
		a = (14 - month) / 12;
		m = month + (12 * a) -3;
		y = year + 4800 - a;
		JDN = day + (153 * m +2) / 5 + 365 * y + (y / 4) - (y/100) + (y/400) - 32045;
		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number:" + JDN);
  }
}