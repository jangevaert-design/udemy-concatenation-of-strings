package edu.cnm.deepdive;

public class ConcatenationOfStrings {

  public static void main(String[] args) {
    String text = "Hello";
    String anotherText = new String("Hello");//this can be done but is redundant.

    //Concatenation
    //two numeric values will be added together with a + but a String and a primitive will be
    //concatenated. The expression is evaluated from left to right.
    System.out.println(2 + 3);//5
    System.out.println("A" + "B");//AB
    System.out.println("A" + 1);//A1
    System.out.println("A" + 1 + 2);//A12
    System.out.println("A" + (1 + 2));//A3
    System.out.println(1 + 2 + "A");//3A because the expression is evaluated from left to right.

    int three = 3;
    String four = "4";
    System.out.println("/n" + 1 + 2 + three + four);//64
    System.out.println(1 + 2 + four + three);//343

    int number = 10;
    int anotherNumber = 20;
    System.out.println("\nresult = " + number + anotherNumber);//result = 1020 -> String concatenation
    //from left to right.
    System.out.println("\nresult = " + (number + anotherNumber));//result = 30;
    System.out.println();
    String str = "";
    for (int i = 0; i < 10; i++) {
      str += i;
    }
    System.out.println(str);//prints 0123456789
  }

}
