public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + N + ":");
        boolean[] isPrime = new boolean[N + 1];
        int count = 0;
        int primeNum = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if(i > 1){
                isPrime[i] = true;
            }
        }
        while (count <= N) {
            for (int i = 2; i < count; i++) {
                if(count % i == 0){
                    isPrime[count] = false;
                }
            }
            count ++;
        }
        for (int i = 0; i < isPrime.length; i++) {
            if(isPrime[i]){
                primeNum ++;
                System.out.println(i);
            }
        }
        double precent = ((double)primeNum/N) * 100;
        System.out.println("There are " + primeNum + " primes between 2 and " + N + " (" + (int)precent + "% are primes)");
    }
}