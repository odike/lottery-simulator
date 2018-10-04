package folder1.folder2;

public class CarLotteryException extends Exception
{
	public CarLotteryException()
	{
		super();
	}
	
	public String toString()
	{
		String st="Lottery number 0 has been drawn";
		return st;
	}
}