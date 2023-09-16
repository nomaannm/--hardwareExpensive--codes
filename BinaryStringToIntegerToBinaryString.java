/* This code will take a binary string,
   and then will evaluate its value so that we can perform any arithmetic operations on it.
   A binary string will be returned then.
*/
@author NomanMumtaz

public class Bin {
    public static void main(String[] args)
    {
        String a = "11";
        String b = "1";
        int aInt = binaryEvaluation(a);
        int bInt = binaryEvaluation(b);
        int output = aInt + bInt ;
        System.out.println(Integer.toString(output));
    }
    static int binaryEvaluation(String num)
    {
        int n = parseInt(num);
        
        int eval = 0;
        int i = 0 ;
        while(n > 0)
        {
            int bit = n%10 ;
            eval = eval + bit * (int)Math.pow(2,i);
            n /= 10;
            i++;
        }

        return eval;
    }

    static String inttoBin(int a)
    {
        int iterator = 10;
        int rem1 = a%2;
        int binFormat = rem1;
        
        while(a >= 1)
        {
            a /= 2;
            int rem = a%2;
            binFormat = binFormat + rem * iterator;
            iterator = iterator * 10;
        }


        return Integer.toString(binFormat);
    }
    
}
