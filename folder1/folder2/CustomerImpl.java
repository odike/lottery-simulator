package folder1.folder2;

import java.util.ArrayList;

public class CustomerImpl extends CustomerFile implements CustomerInterface
{
	public ArrayList<Customer> ReadCustomer ()
	{
		ArrayList<Customer> cust=new ArrayList<Customer>();
		super.ReadCustomer ();
		return cust;
	}
}