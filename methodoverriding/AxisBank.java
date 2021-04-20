package methodoverriding;
public class AxisBank extends Bank
{
   
   @Override
    public int getRateOfInterest()
    {
        return 8;
    }
}