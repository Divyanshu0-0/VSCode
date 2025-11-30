package java;

class customException{
    public static void main(String []args) {
        int cb=10000;
        int db=9000;
        try {
            if(cb<db)
            {
                throw new ArithmeticException("Insufficient Balance");
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
// Output: Insufficient Balance