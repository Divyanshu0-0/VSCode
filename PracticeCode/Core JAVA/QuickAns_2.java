// Change Marks (Number) to Percentage !

import java.util.Scanner;

public class QuickAns_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you Physics Marks : ");
        int Physics = scan.nextInt();
        
        System.out.print("Enter you English Marks : ");
        int English = scan.nextInt();

        System.out.print("Enter you Chemistry Marks : ");
        int Chemistry = scan.nextInt();

        System.out.print("Enter you Mathemetic Marks : ");
        int Mathematic = scan.nextInt();

        System.out.print("Enter you Computer Science Marks : ");
        int Computer = scan.nextInt();

        float Percentage = ((Physics + English + Chemistry + Mathematic + Computer)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(Percentage);
        
        scan.close();

    }
    
}
