

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        for (int i = -1; i <=20 ; i++) {
            System.out.println("Number "+ i +" in fibonacci is " +fib(i));
        }


    }

    public static BigInteger fib(int n){
        BigInteger result = new BigInteger("0");

        if(n<0){
            result =  new BigInteger("0");
            System.out.println("Wrong parameter, returning 0!");
            return result;
        }
        else if(n==0){
            result = new BigInteger("0");
            return result;
        }else if(n==1){
            result = new BigInteger("1");
        }

        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            result = first.add(second);
            first = second;
            second = result;
        }


        return result;
    }
}

