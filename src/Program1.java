interface ZeroParameter
{
	void print();
}
public class Program1 
{
	public static void main(String[] args) 
	{
		ZeroParameter zm = () -> System.out.println("Zero parameter lambda");
		zm.print();
	}
}
