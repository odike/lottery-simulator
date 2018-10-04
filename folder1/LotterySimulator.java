package folder1;
import folder1.folder2.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class LotterySimulator 
{

	public static void main(String[] args) 
	{	
		int time=0;
		int timecount=0;
		int newtimecount=0;
		int nwin=0;
		int dcount=1;
		int drawno=0;
		int index=0;
		boolean correct=true;
		int [] winners= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1};
		double [] price= new double [10];
		Winner [] won= new Winner[10];
		Draw drawing;
		CustomerFile cwr= new CustomerFile();
		cwr.ReadCustomer();
		boolean real=true;
		ChevroletDraw cd= new ChevroletDraw();
		SaturnDraw sd= new SaturnDraw();
		CadillacDraw cad= new CadillacDraw();
		BuickDraw bd= new BuickDraw();
		PontiacDraw pd= new PontiacDraw();

		ArrayList<Customer> cus;
		cus=cwr.ReadCustomer();
		
		VehicleFile vwr= new VehicleFile();
		vwr.ReadVehicle();
		ArrayList<Vehicle> veh;
		veh=vwr.readser();

		DealershipFile dwr= new DealershipFile();
		dwr.ReadDealership();
		ArrayList<Dealership> deal;
		deal=dwr.readser();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of vehicles you would like to be won");
		int choice=scan.nextInt();

		while (nwin<choice)
		{
		try
		{
		FileOutputStream fos=new FileOutputStream("folder1/output.txt");
		OutputStreamWriter osw= new OutputStreamWriter( new BufferedOutputStream(fos));
			int num=(int)(0+Math.random()*(5));

		
		Dealership ddraw=(Dealership)deal.get(num);

		if (ddraw.getDealershipType().equals(DealershipType.CHEVROLET))
		{
			
			drawing=cd;
			drawno=drawing.draw(DealershipType.CHEVROLET);
			
			for (int i=0;i<choice ;i++ )
			{
				if (winners[i]==drawno)
				{
					System.out.println("This is event "+dcount);
					dcount++;
					System.out.println("Starting time of the event is:"+timecount);
					newtimecount=(int)(timecount+Math.random()*(100));
					timecount=newtimecount+1;
					System.out.println("Event will occur at:"+newtimecount);
					System.out.println("The number drawn is :"+drawno);
					System.out.println("Same number as before");
					throw new CarLotteryException();
				}
			}

			if (drawno>=11&&drawno<=20||drawno>=25&&drawno<=35||drawno>45)
			{
				System.out.println("This is event :"+dcount);
				dcount++;
				System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
				timecount=newtimecount+1;
				System.out.println("Event will occur at:"+newtimecount);
				System.out.println("The number drawn is :"+drawno);
				System.out.println("The number is invalid");
				throw new CarLotteryException();
			}





			else 
			{

			System.out.println("This is event :"+dcount);

			System.out.println("Starting time of the event is:"+timecount);
			newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
			System.out.println("The number drawn is :"+drawno);
			System.out.println("The dealership number is:" +ddraw.getCurrentID());
			System.out.println("The dealership name is: "+ddraw.getDealerName());
			System.out.println("The probability used was exponential");
			for (int j=0;j<cus.size();j++ )
			{
				if (cus.get(j).getLotteryNumber()==drawno)
				{
					index=j;
				}
			}
			System.out.println("Dear customer: "+cus.get(index).getFirstName()+" you have won a vehicle!!");
			System.out.println("WON VEHICLE INFORMATION");
			System.out.println(veh.get(nwin).toString());
			veh.get(nwin).setDNM("Glen Ellyn Chevrolet");
			System.out.println("WINNING CUSTOMER INFORMATION");
			System.out.println(cus.get(index).toString());

			System.out.println("");
			winners[nwin]=drawno;
			veh.get(nwin).Price(veh.get(nwin));
			won[nwin]= new Winner(newtimecount,cus.get(index).getCurrentID(),ddraw.getDealerName(),dcount);
			price[nwin]=veh.get(nwin).getPrice();
			nwin++;
			dcount++;
			System.out.println("The car won by this customer is car #"+nwin+" by dealership : "+ddraw.getDealerName());
			}


			if (ddraw.getDealershipType().equals(DealershipType.BUICK))
		{
			
			drawing=bd;
			drawno=drawing.draw(DealershipType.BUICK);
			
			for (int i=0;i<3 ;i++ )
			{
				if (winners[i]==drawno)
				{
					System.out.println("This is event "+dcount);
					dcount++;
					System.out.println("Starting time of the event is:"+timecount);
					newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
					System.out.println("The number drawn is :"+drawno);
					System.out.println("Same number as before");
					throw new CarLotteryException();
				}
			}


			if (drawno>=11&&drawno<=20||drawno>=25&&drawno<=35||drawno>45){
				System.out.println("This is event :"+dcount);
				dcount++;
				System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
				System.out.println("The number drawn is :"+drawno);
				System.out.println("The number is invalid");
				throw new CarLotteryException();
			}





			else 
			{
			System.out.println("This is event :"+dcount);

				System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
			System.out.println("The number drawn is :"+drawno);
			System.out.println("The dealership number is:" +ddraw.getCurrentID());
			System.out.println("The dealership name is: "+ddraw.getDealerName());
			System.out.println("The probability used was uniform");
			for (int j=0;j<cus.size();j++ )
			{
				if (cus.get(j).getLotteryNumber()==drawno)
				{
					index=j;
				}
			}
			System.out.println("Dear customer: "+cus.get(index).getFirstName()+" you have won a vehicle!!");
			System.out.println("WON VEHICLE INFORMATION");
			System.out.println(veh.get(nwin).toString());
			veh.get(nwin).setDNM("Chicago Buick");
			System.out.println("WINNING CUSTOMER INFORMATION");
			System.out.println(cus.get(index).toString());

			System.out.println("");
			veh.get(nwin).Price(veh.get(nwin));
			winners[nwin]=drawno;
			won[nwin]= new Winner(newtimecount,cus.get(index).getCurrentID(),ddraw.getDealerName(),dcount);
			price[nwin]=veh.get(nwin).getPrice();
			dcount++;
			nwin++;
				System.out.println("The car won by this customer is car #"+nwin+" by dealership : "+ddraw.getDealerName());
			}
		}
					if (ddraw.getDealershipType().equals(DealershipType.SATURN))
		{
			
			drawing=sd;
			drawno=drawing.draw(DealershipType.SATURN);
			
			for (int i=0;i<3 ;i++ )
			{
				if (winners[i]==drawno)
				{
					System.out.println("This is event "+dcount);
					dcount++;
					System.out.println("Starting time of the event is:"+timecount);
			newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
					System.out.println("The number drawn is :"+drawno);
					System.out.println("Same number as before");
					throw new CarLotteryException();
				}
			}


			if (drawno>=11&&drawno<=20||drawno>=25&&drawno<=35||drawno>45){
				System.out.println("This is event :"+dcount);
				dcount++;
				System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
				timecount=newtimecount+1;
				System.out.println("Event will occur at:"+newtimecount);
				System.out.println("The number drawn is :"+drawno);
				System.out.println("The number is invalid");
				throw new CarLotteryException();
			}





			else 
			{
			System.out.println("This is event :"+dcount);
	
			System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
			System.out.println("The number drawn is :"+drawno);
			System.out.println("The dealership number is:" +ddraw.getCurrentID());
			System.out.println("The dealership name is: "+ddraw.getDealerName());
			System.out.println("The probability used was normal");
			for (int j=0;j<cus.size();j++ )
			{
				if (cus.get(j).getLotteryNumber()==drawno)
				{
					index=j;
				}
			}
			System.out.println("Dear customer: "+cus.get(index).getFirstName()+" you have won a vehicle!!");
			System.out.println("WON VEHICLE INFORMATION");
			System.out.println(veh.get(nwin).toString());
			veh.get(nwin).setDNM("Saturn of North Chicago");
			System.out.println("WINNING CUSTOMER INFORMATION");
			System.out.println(cus.get(index).toString());
			System.out.println("");
			veh.get(nwin).Price(veh.get(nwin));
			winners[nwin]=drawno;
			won[nwin]= new Winner(newtimecount,cus.get(index).getCurrentID(),ddraw.getDealerName(),dcount);
			price[nwin]=veh.get(nwin).getPrice();
			nwin++;
			dcount++;
			System.out.println("The car won by this customer is car #"+nwin+" by dealership : "+ddraw.getDealerName());
			}
		}

		
				if (ddraw.getDealershipType().equals(DealershipType.PONTIAC))
		{
			
			drawing=pd;
			drawno=drawing.draw(DealershipType.PONTIAC);
			
			for (int i=0;i<choice ;i++ )
			{
				if (winners[i]==drawno)
				{
					System.out.println("Same number as before");
					throw new CarLotteryException();
				}
			}


			if (drawno>=11&&drawno<=20||drawno>=25&&drawno<=35||drawno>45){
				System.out.println("This is event :"+dcount);
				dcount++;
				System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("The event will occur at:"+newtimecount);
				System.out.println("The number drawn is :"+drawno);
				System.out.println("The number is invalid");
				throw new CarLotteryException();
			}





			else 
			{
			System.out.println("This is event :"+dcount);

			System.out.println("Starting time of the event is:"+timecount);
					newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Starting time of the event is:"+newtimecount);
			System.out.println("The number drawn is :"+drawno);
			System.out.println("The dealership number is:" +ddraw.getCurrentID());
			System.out.println("The dealership name is: "+ddraw.getDealerName());
			System.out.println("The probability used was uniform");
			for (int j=0;j<cus.size();j++ )
			{
				if (cus.get(j).getLotteryNumber()==drawno)
				{
					index=j;
				}
			}
			System.out.println("Dear customer: "+cus.get(index).getFirstName()+" you have won a vehicle!!");
			System.out.println("WON VEHICLE INFORMATION");
			System.out.println(veh.get(nwin).toString());
			veh.get(nwin).setDNM("South Suburbs Pontiac");
			System.out.println("WINNING CUSTOMER INFORMATION");
			System.out.println(cus.get(index).toString());

			System.out.println("");
			veh.get(nwin).Price(veh.get(nwin));
			winners[nwin]=drawno;
			won[nwin]= new Winner(newtimecount,cus.get(index).getCurrentID(),ddraw.getDealerName(),dcount);
			price[nwin]=veh.get(nwin).getPrice();
			nwin++;
			dcount++;
			System.out.println("The car won by this customer is car #"+nwin+" by dealership : "+ddraw.getDealerName());
			}
		}
			
			
			
		}


		if (ddraw.getDealershipType().equals(DealershipType.CADILLAC))
		{
			
			drawing=cad;
			drawno=drawing.draw(DealershipType.CADILLAC);
			
			for (int i=0;i<choice ;i++ )
			{
				if (winners[i]==drawno)
				{
					System.out.println("This is event "+dcount);
					dcount++;
			System.out.println("Starting time of the event is:"+timecount);
					newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
					System.out.println("The number drawn is :"+drawno);
					System.out.println("Same number as before");
					throw new CarLotteryException();
				}
			}


			if (drawno>=11&&drawno<=20||drawno>=25&&drawno<=35||drawno>45){
				System.out.println("This is event :"+dcount);
				dcount++;
			System.out.println("Starting time of the event is:"+timecount);
				newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
				System.out.println("The number drawn is :"+drawno);
				System.out.println("The number is invalid");
				throw new CarLotteryException();
			}





			else 
			{
			System.out.println("This is event :"+dcount);
	
			System.out.println("Starting time of the event is:"+timecount);
					newtimecount=(int)(timecount+Math.random()*(100));
			timecount=newtimecount+1;
			System.out.println("Event will occur at:"+newtimecount);
			System.out.println("The number drawn is :"+drawno);
			System.out.println("The dealership number is:" +ddraw.getCurrentID());
			System.out.println("The dealership name is: "+ddraw.getDealerName());
			System.out.println("The probability used was uniform");
			for (int j=0;j<cus.size();j++ )
			{
				if (cus.get(j).getLotteryNumber()==drawno)
				{
					index=j;
				}
			}
			System.out.println("Dear customer: "+cus.get(index).getFirstName()+" you have won a vehicle!!");
			System.out.println("WON VEHICLE INFORMATION");
			System.out.println(veh.get(nwin).toString());
			veh.get(nwin).setDNM("Schaumburg Cadillac");
			System.out.println("WINNING CUSTOMER INFORMATION");
			System.out.println(cus.get(index).toString());

			System.out.println("");
			veh.get(nwin).Price(veh.get(nwin));
			winners[nwin]=drawno;
			won[nwin]= new Winner(newtimecount,cus.get(index).getCurrentID(),ddraw.getDealerName(),dcount);
			price[nwin]=veh.get(nwin).getPrice();
			nwin++;
			dcount++;
				System.out.println("The car won by this customer is car #"+nwin+" by dealership : "+ddraw.getDealerName());
			}
		}
			
			
			

		


		





		}
		catch (CarLotteryException cle)
		{
			System.out.println(cle.toString());
			System.out.println("");
		}
			
		/*catch (FileNotFoundException fnf)
		{
		System.out.println(fnf.toString());
		}*/
		catch (IOException ioe)
		{
			System.out.println(ioe.toString());
		}

			
			
	
	


		}


		try
		{
		//FileOutputStream fos=new FileOutputStream("output.txt");
		//OutputStreamWriter filestream = new OutputStreamWriter(new BufferedOutputStream(fos));
		File file = new File("folder1/output.txt");
		 PrintWriter filestream = new PrintWriter(new FileWriter(file));

		filestream.println("CAR"+"\t"+"\t"+"EVENT"+"\t"+"\t"+"TIME AWARDED"+"\t"+"\t"+"CUSTOMER ID"+"\t"+"\t"+"DEALERSHIP");
		//filestream.println("\n");

		for (int i=0;i<choice ;i++ )
		{
		filestream.println(won[i].getCurrentID()+"\t"+"\t"+won[i].getEvent()+"\t"+"\t"+won[i].getTime()+"\t"+"\t"+"\t"+won[i].getCustomerID()+"\t"+"\t"+"\t"+won[i].getDealer());
		filestream.flush();
		
		}


		}
		catch(IOException ioe)
		{
		System.out.println("Error writing into file");
		ioe.printStackTrace();
		}

		double pr=0;

		for (int i=0;i<price.length ;i++ )
		{
		pr=pr+price[i];
		}
		System.out.println("The total value of all awarded cars is: "+pr);
	}
}
