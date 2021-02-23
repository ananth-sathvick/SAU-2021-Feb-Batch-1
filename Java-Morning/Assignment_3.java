
class PrimeNumberEncounteredException extends Exception {
    private String message = new String("You have encountered an prime number");

    public String message() {
        return this.message;
    }
}

public class Assignment_3 {

    public static Boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                try {
                    throw new PrimeNumberEncounteredException();
                } catch (PrimeNumberEncounteredException e) {
                   System.out.println(e.message() +" "+ i);
                }
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
