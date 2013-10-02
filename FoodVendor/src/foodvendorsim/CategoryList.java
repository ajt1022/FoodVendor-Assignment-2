package foodvendorsim;

public class CategoryList <T> implements VendorInterface<T>{
	
	CategoryNode categories, previous, temp, list;
	public String name;
	public int count=0;
	
	public CategoryList() {
		this.name = "Category list";
		categories = null;
	}

	@Override
	public void add(T element) {
		// add first element
		CategoryNode <T> newNode = new CategoryNode<T>(element);
		newNode.setLink(categories);
		categories = newNode;
		count++;
	}

	@Override
	public T remove(T element) throws NullException {
		CategoryNode <T> current = new CategoryNode<T>(element);
		if(isEmpty() == true){
			
			try{
				throw new NullException("The list is empty.");
				
			}catch(NullException e){
				e.printStackTrace();
			}
		}else{
			previous = categories;
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
		return null;
	}

	public Object pop() {
		Object temp = categories;
		categories = categories.getLink();
		count--;
		return temp;
	}

	@Override
	public boolean contains(T element) {
		CategoryNode<T> current = categories;
		if (!isEmpty()) {
			while (current != null) {
				if (current.getElement().equals(element))
					return true;
				current = current.getLink();
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (categories == null)
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
		CategoryNode <T> temp;
		temp = categories;
		while (temp != null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}
}
