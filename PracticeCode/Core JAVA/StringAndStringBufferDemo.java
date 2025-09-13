public class StringAndStringBufferDemo {
    public static void main(String[] args) {
        // String class examples
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Original String str1: " + str1);
        System.out.println("Original String str2: " + str2);

        // concat() - concatenates two strings and returns a new string
        String str3 = str1.concat(" " + str2);
        System.out.println("After concat(): " + str3);

        // equals() - compares content of two strings
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equals \"Hello\"? " + str1.equals("Hello"));

        System.out.println("\n--- StringBuffer examples ---");

        // StringBuffer initialization
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);

        // setCharAt() - changes character at specified index
        sb.setCharAt(0, 'J');  // "Jello"
        System.out.println("After setCharAt(0, 'J'): " + sb);

        // setLength() - changes the length of the buffer
        sb.setLength(3);  // truncates to "Jel"
        System.out.println("After setLength(3): " + sb);

        // append() - appends data to the end
        sb.append("loWorld");  // "JelloWorld"
        System.out.println("After append(\"loWorld\"): " + sb);

        // insert() - inserts a string at the specified index
        sb.insert(5, " ");  // "Jello World"
        System.out.println("After insert(5, \" \"): " + sb);

        // equals() - compares references (not content) for StringBuffer
        StringBuffer sb2 = new StringBuffer("Jello World");
        System.out.println("sb equals sb2? " + sb.equals(sb2));  // false (reference check)
        System.out.println("sb content equals sb2 content? " + sb.toString().equals(sb2.toString())); // true

    }
}
