package exceptiondemo;

public class InvalidValue extends Exception
{
	public InvalidValue(String msg) 
	{
		super(msg);
	}
}