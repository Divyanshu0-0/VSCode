import java.io.*;
class filebuffering
{
    public static void main(String args[]) throws IOException
{
        FileWriter fw = new FileWriter("test.txt",true);
        BufferedWriter bw1 = new BufferedWriter(fw);
        bw1.write("Hello World");
        bw1.close();
}
}