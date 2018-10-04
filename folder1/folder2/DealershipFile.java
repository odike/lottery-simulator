package folder1.folder2;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class DealershipFile extends Dealership
{
	public ArrayList<Dealership> ReadDealership()
	{
		ArrayList<Dealership> dealershiplist=new ArrayList<Dealership>();
		try
		{
			FileInputStream fis=new FileInputStream("folder1/folder2/Dealership.txt");
			BufferedReader filereader=new BufferedReader(new InputStreamReader(fis));
			String line=filereader.readLine();
			
			while (line!=null)
		{
		StringTokenizer st= new StringTokenizer(line,",");
		String name=st.nextToken();
		String type=st.nextToken();
		DealershipType dty=null;
		if (type.equals("CHEVROLET"))
		{
		dty=DealershipType.CHEVROLET;
		}
		else if (type.equals("PONTIAC"))
		{
		dty=DealershipType.PONTIAC;
		}
		else if (type.equals("BUICK"))
		{
		dty=DealershipType.BUICK;
		}
		else if (type.equals("CADILLAC"))
		{
		dty=DealershipType.CADILLAC;
		}
		else if (type.equals("SATURN"))
		{
		dty=DealershipType.SATURN;
		}

		Dealership deal= new Dealership(name,dty);
		dealershiplist.add(deal);
		line= filereader.readLine();
		}
		fis.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.toString());
		}
	try
		{
		FileOutputStream fos=new FileOutputStream("folder1/folder2/dealership.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		for (int i=0;i<dealershiplist.size();i++ )
		{
			oos.writeObject(dealershiplist.get(i));
		}
		oos.close();
		 }
	catch(IOException ioe)
		{
		System.out.println("Error writing into file");
		ioe.printStackTrace();
		}

		return dealershiplist;
	}

	public ArrayList<Dealership> readser()
	{
		ArrayList <Dealership> dealerships= new ArrayList<Dealership>();
		int i=0;
		try
		{
		FileInputStream fis= new FileInputStream("folder1/folder2/dealership.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);

		while (1==1)
		{
		dealerships.add((Dealership)ois.readObject());
		}
		

		}
		catch (EOFException eo)
		{
			System.out.println(eo.toString());
		}
		catch (ClassNotFoundException cnf)
		{
		System.out.println(cnf.toString());
		}
		catch (FileNotFoundException fnf)
		{
		System.out.println(fnf.toString());
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.toString());
		}

		return dealerships;
	}
}