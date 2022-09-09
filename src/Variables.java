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
        double moreAccurate = 847956.7336485903;   //64 bit   ~15 digits of accuracy//    MOST USED

        //characters, are really integers
        char single = '&';      //16 bit    655355 characters in the bank (UNICODE)
        // 'A' == 65        'a' == 97       '0' == 48

        //boolean
        boolean Lightswitch = true;         //true or false

        String wordsPhrases = "Hello, World!";

        System.out.println(small);
        System.out.println(medium);
        System.out.println(normal);
        System.out.println(large);
        System.out.println(lessAccurate);
        System.out.println(moreAccurate);
        System.out.println(single);
        System.out.println(Lightswitch);
        System.out.println(wordsPhrases);
    }
}