package TalentHub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created Atiar Talukdar
 * Created on 2021/12/17
 * swajan.talukdar@gmail.com
 * https://en.talenthub.jp/coding_test/IfYuOnPBjYFukAq3gL-7Sg/result
 */

public class MagicNumber {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        //int[] numbers = {1,2,3,4,6,220, 50};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();

        if((readLine != " ")|| (readLine!=null) || (readLine.trim().length()>0)){

            int input = Integer.parseInt(readLine.trim());
            int num1 = sumOfDivisor(input);
            int num2 = sumOfDivisor(num1);

            //System.out.println(input+ " = " +num1+ ", " +num2);

            if(num1==num2) {
                System.out.println("PERFECT");
            }else if(input == num2) {
                System.out.println(num1);
            }else {
                System.out.println("NONE");
            }
        }


    }


    //Calculating Sum of divisor In normal way
    static int sumOfDivisorNormal(int num1)
    {
        int ret = 0;
        for (int i = 1; i <= num1/2; i++) {
            if (num1 % i == 0)
                ret += i;
        }

        return ret;
    }


    // Calculating Sum of divisor in efficient way
    static int sumOfDivisor(int n)
    {
        int ret = 0;

        // calculating all the divisors
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                if (i == (n / i))
                    ret += i;
                else
                    ret += (i + n / i);
            }
        }

        return (ret + 1);
    }
}
