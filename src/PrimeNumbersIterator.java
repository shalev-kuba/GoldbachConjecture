import java.math.BigInteger;
import java.util.Iterator;

public class PrimeNumbersIterator implements Iterable<BigInteger>, Iterator<BigInteger>{
	
	BigInteger current;
	
	public PrimeNumbersIterator() {
		this.current = BigInteger.valueOf(2);
	}
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public BigInteger next() {
		BigInteger returnValue = current;
		current = current.nextProbablePrime();
		return returnValue;
	}

	@Override
	public Iterator<BigInteger> iterator() {
		return this;
	}
	
}
