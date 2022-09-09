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
        byte small = 127;         //8 bit     -128 to 127
        short medium = -23846;    //16 bit    -32768 to 32767
        int normal = 2843965;     //32 bit    -2147483648 to 2147483647     MOST USED
        long large = 83785499472L;//64 bit    -9quintillion to 9quintillion

        //reals -- DECIMALS!!
        float lessAccurate = 39.627F; //32 bit   ~7 digits of accuracy
        double moreAccurate = 847956.7336485903;   //64 bit   ~15 digits of accuracy    MOST USED
        System.out.println("/////////////////////////////////");
        System.out.println("*Some Person            07/18/22*");
        System.out.println("*                               *");
        System.out.println("*        integer types          *");
        System.out.println("*                               *");
        System.out.println("*8 bit - byteOne = "+"\t\t*");
    }
}