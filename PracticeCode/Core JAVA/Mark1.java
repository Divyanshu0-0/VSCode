// File: Core JAVA/Mark1.java
class Mark1 { //Call by Reference 
int mic,cam,rad;
void setVolume(){
System.out.println("Volume set Successfully.");
}
void setGPS(){
    System.out.println("GPS set Successfully.");
}
}  
    class Example 
{
    public static void main(String[] args) {
        {
            Mark1 m1=new Mark1();
            Mark1 m2=new Mark1();
           
            m1.mic=1;
            m1.cam=3;
            m1.rad=4;

            System.out.println(m1.mic);
            System.out.println(m1.cam);
            System.out.println(m1.rad);

            System.out.println(m2.mic);
            System.out.println(m2.cam);
            System.out.println(m2.rad);
            
            m1.setVolume();
            m1.setGPS();

            m2.setVolume();
            m2.setGPS();
        }
    }
}
    