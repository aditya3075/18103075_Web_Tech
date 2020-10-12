import java.util.*;
public class Out
{
	public static void main(String[]args)
	{
      int num=-1;
      byte byt=(byte)num;
      System.out.println(byt);
      char chr=(char)byt;
      System.out.println(chr); 
      int finall=(int)chr;
      System.out.println(finall);
	}
}
//The output for program is 65535 which is not same as initial i.e -1 
//This happens because when int is converted to byte, byte has 8 bits and int has 32 bits
//and -1 is same in int as well as byte .so byt gives output -1 .
//char has range(0,65535) which means that it cannot hold negative values ,and converting byte to char gives'?'
//to convert char to int if it is not in range then 65536 is added to original int 
//so if -1 then output is 65535 ,for -2 65534 and so on.. So final output is 65535
