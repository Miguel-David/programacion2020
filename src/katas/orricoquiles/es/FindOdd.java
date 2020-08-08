package katas.orricoquiles.es;

import java.util.Arrays;

public class FindOdd {
  public static int findIt(int[] a) {
    return Arrays.stream(a).reduce(FindOdd::operacion).orElse(0);
  }

  public static void main(String[] args) {
    System.out.println(FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
  }

  private static int operacion(int suma, int elemento) {
    return suma ^ elemento;
  }
}
