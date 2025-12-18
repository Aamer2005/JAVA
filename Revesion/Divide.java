package arith;
import java.util.Scanner;

public class Divide{
    //static Scanner sc = new Scanner(System.in);
    Integer x , y;
    public Integer result;

    public Divide()
    {
        System.out.println("Arguments Not Passef , Exit!!!");
        System.exit(1);
    }

    public Divide(int a, int b)
    {
        this.x = a;
        this.y = b;
        divide();
    }


    private void divide()
    {
        /*System.out.println("x:");
        int x = sc.nextInt();
        System.out.println("y:");
        int y = sc.nextInt();*/
        try{
            if(y==0) throw new MyException();
            result =  x/y;
            
        }
        catch(MyException me)
        {
            System.out.println(me);
            System.out.println(MyException.cause);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        
    }
    
}

class MyException extends ArithmeticException{

    static final String cause = "Division By Zero For Integer Is Not Allowed";

    MyException(){}

    MyException(String msg)
    {
        super(msg);
    }
}