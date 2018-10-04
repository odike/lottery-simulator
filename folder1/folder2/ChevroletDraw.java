package folder1.folder2;
import java.util.Random;

public class ChevroletDraw extends Draw
{
	public int draw(DealershipType dtp)throws CarLotteryException
	{
		int c=0;
		
		if(dtp.equals(DealershipType.CHEVROLET))
		{
			c=(int)(-5*Math.log(Math.random()))+1;
			
			if(c<=0)
			{
				throw new CarLotteryException();
			}
		}
		
		else c=-1;
		return c;
	}
}