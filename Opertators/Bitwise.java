package Opertators;

class Bitwise {
    public static void main(String[] args) {
      // && operator
      System.out.println((5 > 3) && (8 > 5));  // true true => true
      System.out.println((5 > 3) && (8 < 5));  // true false =>false
  
      // || operator
      System.out.println((5 < 3) || (8 > 5));  // true   //false  true =>true
      System.out.println((5 > 3) || (8 < 5));  // true  //true false =>true
      System.out.println((5 < 3) || (8 < 5));  // false   //false false => false
  
      // ! operator
      System.out.println(!(5 == 3));  // true
      System.out.println(!(5 > 3));  // false
    }
  }
  
