class Java_continue {
  public static void main(String[] args) {
    // for loop
    for (int i = 1; i <= 20; i++) 
    {

      // if value of i is between 5 and 10
      // continue is executed
      if (i > 5 && i < 10) {
        continue;
      }
      System.out.println(i);
    }
  }
}
