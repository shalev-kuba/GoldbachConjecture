import java.math.BigInteger;

public class GoldbachsConjecture {
	public static void main(String args[]) {
		EvenNumbersIterator evens = new EvenNumbersIterator(BigInteger.valueOf(10), BigInteger.valueOf(2));
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(evens.next());
		}
		
		PrimeNumbersIterator primes = new PrimeNumbersIterator();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(primes.next());
		}
	}
}
