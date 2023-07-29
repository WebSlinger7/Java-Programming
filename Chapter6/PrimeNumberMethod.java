public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n : ");
        printPrimeNumbers(50);
    }
    //A method to print prime number
public static void printPrimeNumbers(int NumberOfPrimes){
    final int Number_OF_Primes_Per_Line = 10;
    int count = 0; //Count the number of prime numbers
    int number = 2;// A number to be tested for primeness

    while(count < NumberOfPrimes){
        //Print the prime number and increase the count
        if(isPrime(number)){
            count ++;
            if(count% Number_OF_Primes_Per_Line == 0){
                System.out.printf("%5d\n" + number);
            }
            else{
                System.out.printf("%5d"+ number);
            }
        }
        number++;
    }
}

    //A method to check whether the number is prime or not
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number/2; divisor++){
            if(number%divisor == 0){
                return false;
            }
            return true;

        }
        return false;
    }
}
