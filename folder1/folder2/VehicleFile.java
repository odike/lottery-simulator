package folder1.folder2;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class VehicleFile extends Vehicle
{
	public ArrayList<Vehicle> ReadVehicle() 
	{	

		ArrayList <Vehicle> vehiclelist= new ArrayList<Vehicle>();
		try
		{
		FileInputStream fis= new FileInputStream("Vehicle.txt");
		BufferedReader filereader=new BufferedReader(new InputStreamReader(fis)); 
		String line= filereader.readLine();

		while (line!=null)
		{
		StringTokenizer st= new StringTokenizer(line,",");
		String type=st.nextToken();
		VehicleType vt=null;
		if (type.equals("FOUR_DOOR_SEDAN"))
		{
		vt=VehicleType.FOUR_DOOR_SEDAN;
		}
		else if (type.equals("TWO_DOOR_COUPE"))
		{
		vt=VehicleType.TWO_DOOR_COUPE;
		}
		else if (type.equals("TRUCK"))
		{
		vt=VehicleType.TRUCK;
		}
		else if (type.equals("SUV"))
		{
		vt=VehicleType.SUV;
		}
		else if (type.equals("SPORT"))
		{
		vt=VehicleType.SPORT;
		}
 		else if (type.equals("MINI_VAN"))
		{
		vt=VehicleType.MINI_VAN;
		}		

		double acc=Double.parseDouble(st.nextToken());
		int time= Integer.parseInt(st.nextToken());
		double ini_v=Double.parseDouble(st.nextToken());
		double ini_d=Double.parseDouble(st.nextToken());

		Vehicle veh= new Vehicle(vt,acc,time,ini_v,ini_d);
		vehiclelist.add(veh);
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
		FileOutputStream fos=new FileOutputStream("folder1/folder2/vehicle.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		for (int i=0;i<vehiclelist.size();i++ )
		{
			oos.writeObject(vehiclelist.get(i));
		}
		oos.close();
		 }
		catch(IOException ioe)
		{
		System.out.println("Error writing into file");
		ioe.printStackTrace();
		}

		return vehiclelist;
	}

		public ArrayList<Vehicle> readser()
		{
		ArrayList <Vehicle> vehicles= new ArrayList<Vehicle>();
		int i=0;
		try
		{
		FileInputStream fis= new FileInputStream("folder1/folder2/vehicle.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);

		while (1==1)
		{
		vehicles.add((Vehicle)ois.readObject());
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

		return vehicles;
	}
}
