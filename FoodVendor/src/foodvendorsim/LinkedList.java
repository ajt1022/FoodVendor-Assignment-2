package foodvendorsim;

public class LinkedList <T> implements VendorInterface <T>{
	public LinkedListNode <T> list,  previous, current, temp;
	public String name;
	public int count=0;
	
	public LinkedList() {
		this.name = "Linked list";
		list = null;
	}

	@Override
	public void add(T element) {
		// add first element
		LinkedListNode <T> newNode = new LinkedListNode<T>(element);
		newNode.setLink(list);
		list = newNode;
		count++;
	}

	@Override
	public T remove(T element) throws NullException {
		LinkedListNode <T> current = new LinkedListNode<T>(element);
		if(isEmpty() == true){
			
			try{
				throw new NullException("The list is empty.");
				
			}catch(NullException e){
				e.printStackTrace();
			}
		}else{
			previous = list;
			if(list.getElement().equals(element)){
				current = list;
				list = list.getLink();
			}
			
			for( current=list; current!=null; current=current.getLink()){
				if(current.getElement().equals(element)){
					temp = current;
					previous.setLink(current.getLink());
					break;
				}else{
					previous = current;
					current = current.getLink();
				}
			}
		}
		count --;
		return temp.getElement();
	}

	public Object pop() {
		Object temp = list;
		list = list.getLink();
		count--;
		return temp;
	}

	@Override
	public boolean contains(T element) throws NullException {
		LinkedListNode<T> current = list;
		if (!isEmpty()) {
			while (current != null) {
				if (current.getElement().equals(element))
					return true;
				current = current.getLink();
			}
			try{
				throw new NullException("The list is empty.");
				
			}catch(NullException e){
				e.printStackTrace();
				System.err.printf("The list has nothing in it.");
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (list == null)
			return true;
		else
			return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int size() {
		return this.count;
	}

	public String toString() {
		String out = "";
		LinkedListNode <T> temp;
		temp = list;
		while (temp != null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}
}
