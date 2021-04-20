package methodoverriding;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		AxisBank axisBank = new AxisBank();
		System.out.println("AxisBank-GetRtofIntrst - "+axisBank.getRateOfInterest());
		SbiBank sbiBank = new SbiBank();
		System.out.println("SbiBank-GetRtofIntrst - "+sbiBank.getRateOfInterest());	
		BobBank bobBank = new BobBank();
		System.out.println("BobBank-GetRtofIntrst - "+bobBank.getRateOfInterest());
	}
}