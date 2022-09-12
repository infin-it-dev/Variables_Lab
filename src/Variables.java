public class Variables
{
    public static void main ( String[] args )
    {
        //define 1 variable of each of the
        //following data types
        //byte	short		int 		long
        //float	double
        //char      boolean	String

        //integer variables
        byte s = 47;         //8 bit     -128 to 127
        short m = -32741;    //16 bit    -32768 to 32767
        int l = -2126381546;     //32 bit    -2147483648 to 2147483647     MOST USED
        long xL = 59625175954L;//64 bit    -9quintillion to 9quintillion

        //reals -- DECIMALS!!
        float lA = 68.437F; //32 bit   ~7 digits of accuracy
        double mA = 846958.84526151458;   //64 bit   ~15 digits of accuracy//    MOST USED

        //characters, are really integers
        char singleA = 'A';      //16 bit    655355 characters in the bank (UNICODE)
        // 'A' == 65        'a' == 97       '0' == 48

        //boolean
        boolean microwaveOn = true;         //true or false

        String Hey = "Hello World!";

        System.out.println(s);
        System.out.println(m);
        System.out.println(l);
        System.out.println(xL);
        System.out.println(lA);
        System.out.println(mA);
        System.out.println(singleA);
        System.out.println(microwaveOn);
        System.out.println(Hey);
    }
}