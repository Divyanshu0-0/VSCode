package java;

public class Exception{


    public static void main(String []args)
    {
        int cb=10000;
        int db=2546;
        try
        {
            if(cb<db)
            {
                throw new ArithmeticException("Insufficient Balance");
            }
            cb=cb-db;
            System.out.println("Transaction Successful");
            System.out.println("Current Balance is: "+cb);
        }
        catch(ArithmeticException a1)
        {
            System.out.println(a1.getMessage());
            System.out.println("Current Balance is: "+db);
        }
       
    }
}
        