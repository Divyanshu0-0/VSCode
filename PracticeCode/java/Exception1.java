package java;

import java.io.*;
public class Exception1 {
    public static void main(String []args) throws IOException
    {
        try
        {
            throw new IOException();
        }
        catch(IOException e1)
        {
            System.out.println(e1.getMessage());
        }
    }
    
}
// Output: Exception in thread "main" java.io.IOException