public class MyArrayList {
  int   size;
  int[] cont;
  final int initSize = 10;
  
  public MyArrayList() {
    size = initSize;
    cont = new Array[Object](initSize);
  }
  
  public boolean add(Object obj) {
    for (int i = 0; i < cont.length; i++) {
      if (cont[i] == null) {
        cont[i] = obj;
        return true;
      }
    }
    doubleTheSize();
    add(obj);
  }
  
  public boolean add(int index, Object obj) {
    for (int i = cont.length - 1; i > index; i--) {
       if (i == cont.length - 1)
         break;
       cont[i] = cont[i-1];
    }
    cont[index] = obj;
  }
  
  public boolean remove(Object obj) {
    
  }
  
  public boolean remove(int index) {
    
  }
  
  
  public Object get(int index) {
     
  }
  
  private void doubleTheSize() {
    
  }
  
  public void main(String[] args) {
    System.out.println("Hello"); 
  }
}
