import java.math.BigInteger;
import java.util.Iterator;

public class EvenNumbersIterator implements Iterable<BigInteger>, Iterator<BigInteger> {
	
	BigInteger current;
	BigInteger d;
	
	public EvenNumbersIterator(BigInteger start, BigInteger d) {
		this.current = start;
		this.d = d;
	}
	
	@Override
	public boolean hasNext() {
		return true;
	}
	
	public void learnHowWorkWithGit() {
		// can delete this function
	}

	@Override
	public BigInteger next() {
		BigInteger returnValue = current;
		current = current.add(d);
		return returnValue;
	}
	
	public void anotherCheck() {
		
	}

	@Override
	public Iterator<BigInteger> iterator() {
		return this;
	}
	
}
