import java.math.BigInteger;

public class GoldbachsConjecture {
	public static void main(String args[]) {
		Long startTime = System.nanoTime();
		
		EvenNumbersIterator evens = new EvenNumbersIterator(BigInteger.valueOf(10), BigInteger.valueOf(2));
		
		for(BigInteger n: evens) {
			for(PrimeNumbersIterator primes = new PrimeNumbersIterator() ;  ;) {
				BigInteger c = primes.next();
				BigInteger a = n.subtract(primes.next());
				if(a.isProbablePrime(100)) {
					System.out.println(a.intValue() + " + " + c.intValue() +  " = " + n.intValue() + " Took " + (System.nanoTime() - startTime) + " nano seconds");
					System.out.println("Took " + (System.nanoTime() - startTime) + " seconds");
					break;
				};
				if(c.compareTo(n.divide(BigInteger.valueOf(2))) > 0 ) break;
			}
			if(n.compareTo(BigInteger.valueOf(1000)) == 0) break;
		}
	}
}
