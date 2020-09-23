package Calculator.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	//Addition Function
    public static Integer sum(Integer x,Integer y)
    {
        if (x == null || y == null) 
        		return null;
        return (x + y);
    }
    
    //Calculating difference between two numbers
    public static int diff(int x, int y)
    {
    	return x-y ;
    }
    
    // Multiplication of two number
    public static int multiplication(int x ,int y)
    {
	    return (x * y);    	
    }
    
    // Division of two numbers
    public static int division (int x ,int y)
    {
	    return (x / y);   	
    }
}
