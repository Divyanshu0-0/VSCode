public class mark10 {
    public static void main(String[] args) {

        byte x = 5;
        int y = 6;
        short z = 8;
        int a = 45 + 4;
        float b = 6.54f + x;
        System.out.println(b);
        System.out.println(a); // Print the value of 'a' to use the variable
        System.out.println(y); // Use the variable y to avoid unused variable warning
        System.out.println(z); // Use the variable z to avoid unused variable warning

    }
}

/*  Resulting data types after arithmetic Operators

R = b + s --> int              b = byte
R = s + i --> int              l = long 
R = l + f --> float            s = short   
R = i + f --> float            i = integer 
R = c + i --> int              f = float
R = c + s --> int              d = double 
R = l + d --> double           c = character
R = f + d --> double

R = b + s --> int 
R = b + s --> int 

*/