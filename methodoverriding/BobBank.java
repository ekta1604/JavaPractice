package methodoverriding;
public class BobBank extends Bank
{
   
   @Override
    public int getRateOfInterest()
    {
        return 10;
    }
}