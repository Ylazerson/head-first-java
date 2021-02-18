import java.util.Date;

class FormatTester
{
	public static void main( String [] args ) 
    {
    	// ---------------- Number formatting example 1 -----------------------
        String string1 = String.format("%, d", 1000000000); 
        System.out.println(string1);

        // ---------------- Number formatting example 2 -----------------------
        String string2 = String.format("I have %.2f bugs to fix", 476578.09876); 
        System.out.println(string2);

        // ---------------- Number formatting example 3 -----------------------
        String string3 = String.format("I have %,.2f bugs to fix", 476578.09876); 
        System.out.println(string3);

        // ---------------- Number formatting example 4 -----------------------
        String string4 = String.format("The rank is %,d out of %,.2f", 18972653, 1897263.877837);
        System.out.println(string4);

        // ------------------ Date formatting example 1 -----------------------
        Date date1 = new Date();

        String string5 = String.format("Today is %tc - got that sir?", date1);
        System.out.println(string5);

        // ------------------ Date formatting example 2 -----------------------
        System.out.println(String.format("%tA, %<tB %<td", new Date()));


    }
}