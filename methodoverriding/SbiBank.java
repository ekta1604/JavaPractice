package methodoverriding;
public class SbiBank extends Bank
{
   
   @Override
    public int getRateOfInterest()
    {
        return 5;
    }
}