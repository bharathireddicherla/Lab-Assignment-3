public class Test2 {
	public static void main(String[] args)
	{
	Invoice invoice  = new Invoice("1", "Watch", 4, 1000.0);
	String k=invoice.toString();
	System.out.println(k);
	}
}