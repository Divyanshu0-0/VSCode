import java.util.*;
public class mark5 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);  //Taking input from User/Keyboard
        System.out.print("Enter Number: ");
        //   int a =sc.nextInt(); 
        float a =var.nextInt(); 
        System.out.print("Enter Number: ");
        //   int b = sc.nextInt();
        float b = var.nextInt();
        float sum = a+b;
        System.out.print("The Sum of THese number is:");
        System.out.print(sum);
        var.close();
    }
    
}
