public class MyArrayList {
	
	private int size;
	private Object data[];
	private int index;
	private static final int SIZE_FACTOR = 5;
	
	public MyArrayList() {
		this.data = new Object[SIZE_FACTOR];
		this.size = SIZE_FACTOR;
		this.index = 0;
	}

	public void add(OBject obj) {
		if(this.index == this.size - 1) {
			increaseSize();
		}
		data[this.index] = obj;
		this.index++;
	}

	private void increaseSize() {
		this.size = this.size + SIZE_FACTOR;
		Object newData[] = new Object[this.size];
		for (int i = 0; i < data; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
	}

	public Object get(int i) throws Exception{
		if (i > this.index-1) 
			throw new Exception("ArrayIndexOutOfBound");
		if (i<0)
			throw new Exception("Negative Value");
		return this.data[i];
	}

	public void remove(int i) throws Exception {
		if (i>this.index-1) 
			throw new Exception("ArrayIndexOutOfBound");
		if (i<0)	
			throw new Exception("Negative Value");
		for (int x = i; x < this.data.length-1;x++)
			data[x] = data[x+1];
		this.index--;
	}

	public static void main(String[] args) throws Exception {
		MyArrayList alist = new MyArrayList();
		alist.add("0");
		alist.add("1");
		alist.add("2");
		alist.add("3");
		alist.add("4");

		alist.remove(2);
		System.out.println(alist.get(3));
	}
}
