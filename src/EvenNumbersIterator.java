import java.math.BigInteger;
import java.util.Iterator;

public class EvenNumbersIterator implements Iterable<T>, Iterator<E> {
	
	BigInteger start;
	BigInteger end;
	
	public EvenNumbersIterator(BigInteger end) {
		this.start = BigInteger.valueOf(2);
		this.end = end;
	}
	
	@Override
	public boolean hasNext() {
		return start.compareTo(end) <= 0;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
