interface ParametersWithReturnType
{
	int add(int a, int b);
}
public class Program3 
{
	public static void main(String[] args) 
	{
		ParametersWithReturnType pm = (a,b) -> a+b;
		System.out.println(pm.add(3, 5));
	}
}
