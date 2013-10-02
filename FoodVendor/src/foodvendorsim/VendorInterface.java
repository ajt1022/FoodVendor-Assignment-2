package foodvendorsim;

public interface VendorInterface <T>{

	public void add(T element);
	public T remove(T elememt) throws NullException;
	public boolean contains(T element) throws NullException;
	public boolean isEmpty();
}
