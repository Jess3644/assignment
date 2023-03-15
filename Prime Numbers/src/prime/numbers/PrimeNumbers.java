package prime.numbers;

public class PrimeNumbers {

    public static  boolean isPrime(int p){
        if (p<=1){
            return false;
        }
        for (int i=2; i <=Math.sqrt(p);i++){
            if (p % i == 0){
                return false;
            }
        }
        return true;
    }
 public static void main(String[]args){
     for (int i=1;i<=500;i++){
         if (isPrime(i)){
             System.out.print(i+" ");
         
     }
   }
 }
}