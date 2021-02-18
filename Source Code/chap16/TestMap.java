
import java.util.*;

public class TestMap
{
	public static void main(String[] args) 
	{
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Kathy", 43);
        scores.put("Bert", 765);
        scores.put("Jake", 82);
        scores.put("Bert", 656);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
	}	
}