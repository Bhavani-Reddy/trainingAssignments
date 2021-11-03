class MainClass 
{
	public static void main(String[] args) 
	{
		Waiter w= new Waiter();
		Menu m = w.getObject();
		m.food();
	}
}
