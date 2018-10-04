package folder1.folder2;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class CustomerFile extends Customer
{
	int cnt=0;
	
	public ArrayList<Customer> ReadCustomer()
	{
		ArrayList<Customer> customerlist=new ArrayList<Customer>();
		try
		{
			FileInputStream fil=new FileInputStream("folder1/folder2/Customer.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fil));
			String line=br.readLine();
			
			while(line!=null)
			{
				StringTokenizer str=new StringTokenizer(line,",");
				String fnam=str.nextToken();
				String lnam=str.nextToken();
				int lotto=Integer.parseInt(str.nextToken());
				Customer cust=new Customer(fnam,lnam,lotto);
				customerlist.add(cust);
				line=br.readLine();
			}
			fil.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.toString());
		}
		
		try
		{
			FileOutputStream fos=new FileOutputStream("folder1/folder2/customer.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			for(int i=0;i<customerlist.size();i++)
			{
				Customer cust=customerlist.get(i);
				if(cnt<6)
				{
					cust.setCustomerType(CustomerType.A);
				}
				else if(cnt>=6&&cnt<=10)
				{
					cust.setCustomerType(CustomerType.B);
				}
				else if(cnt>=11&&cnt<=15)
				{
					cust.setCustomerType(CustomerType.C);
				}
				else if(cnt>=16&&cnt<=20)
				{
					cust.setCustomerType(CustomerType.D);
				}
				else if(cnt>=21&&cnt<=25)
				{
					cust.setCustomerType(CustomerType.E);
				}
				oos.writeObject(cust);
				cnt++;
			}
			oos.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Error Writing to the file");
			ioe.printStackTrace();
		}
		
		return customerlist;
	}
}