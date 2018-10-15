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
    for (int i = 0; i < cont.length; i++) {
        if(cont[i] == obj)
            remove(i);
    }
    return false;
  }
  
  public boolean remove(int index) {
    for (int i = index + 1; i< cont.length; i++) {
        cont[i-1] = cont[i];
    }
    return true;
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
    al.showContent();
    System.out.print("____________________________");
    al.remove(al);
    al.showContent();
    System.out.print("____________________________");
    al.remove(2);
    al.showContent();
    System.out.print("____________________________");
  }
}
