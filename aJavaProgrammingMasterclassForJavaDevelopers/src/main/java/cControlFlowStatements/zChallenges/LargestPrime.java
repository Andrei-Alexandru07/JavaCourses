package cControlFlowStatements.zChallenges;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(5678));
    }

    public static int getLargestPrime(int number){
        if (number <=1)                         // If the number is negative or lack prime numbers,q return -1
            return -1;
        for (int i = number-1; i > 1; i--) {    //Loop the number divided with a lesser and lesser
            if (number % i == 0)                //number until we get a divider that's even, % == 0
                number = i;                     //When we do, in turn check that number for primes.
        }                                       //And then the next, and the next etc.
        return number;                          //Once we are down to 2 we return the prime number.
    }

}
