public class MyArrayList {
  private int   size;
  private Object[] cont;
  private final int initSize = 10;
  
  public MyArrayList() {
    size = initSize;
    cont = new Object[initSize];
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
    return true;
  }
  
  public boolean add(int index, Object obj) {
    for (int i = cont.length - 1; i > index; i--) {
       if (i == cont.length - 1)
         break;
       cont[i] = cont[i-1];
    }
    cont[index] = obj;
    return true;
  }
  
  public boolean remove(Object obj) {
    return false;
  }
  
  public boolean remove(int index) {
    return false;
  }
  
  public void showContent() {
      for (int i = 0; i < cont.length; i++) {
          System.out.println(cont[i]);
      }
  }
  
  
  public Object get(int index) {
     return cont[index];
  }
  
  private void doubleTheSize() {
    size *= 2;
    Object[] newCont = new Object[cont.length * 2];
    for (int i = 0; i < cont.length; i++) {
        newCont[i] = cont[i];
    }
    cont = newCont;
  }
  
  public static void main(String[] args) {
      
    MyArrayList al = new MyArrayList();
    al.add(1);
    al.add(2);
    al.add("3");
    al.add(false);
    al.add(al);
    // al.add("6");
    // al.add("7");
    // al.add("8");
    // al.add("9");
    // al.add("10");
    // al.add("11");
    // al.add("12");
    // al.add("13");
    // al.add("14");
    // al.add("15");
    // al.add("16");
    // al.add("17");
    // al.add("18");
    
    al.showContent();
  }
}
