package folder1.folder2;
//import java.util.Random;

public class PontiacDraw extends Draw
{
	public int draw(DealershipType dtp)throws CarLotteryException
	{
		int p;
		
		if(dtp.equals(DealershipType.PONTIAC))
		{
			p=(int)(1+Math.random()*(21));
			
			if(p<=0)
			{
				throw new CarLotteryException();
			}
		}
		
		else p=-1;
		
		return p;
	}
}