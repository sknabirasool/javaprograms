
class ListOfNumbers {

 public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[12] = 11;  // 0-9 
      System.out.println(arr[9]);
    }
    catch (NumberFormatException e1) {
      System.out.println("NumberFormatException => " + e1.getMessage());
    }
    catch (IndexOutOfBoundsException e2) {
      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
      
    }
  }
}

class MultiCatch {
  public static void main(String[] args) {
  ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}
