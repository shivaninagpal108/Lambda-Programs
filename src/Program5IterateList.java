import java.util.ArrayList;
public class Program5IterateList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Shivani");
		names.add("Sagar");
		names.add("Manisha");
		names.add("Tanishka");
		names.add("Soniya");
		names.forEach(l -> System.out.println("Name : "+l));	
	}

}
