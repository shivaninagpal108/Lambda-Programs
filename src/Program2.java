interface Parameters
{
	void add(int a, int b);
}
public class Program2 
{
	public static void main(String[] args) 
	{
		Parameters pm = (a,b) -> System.out.println("Parameters lambda, after addition: "+(a+b));
		pm.add(2, 4);

	}
}
