package katas.orricoquiles.es;

public class DRoot {
  public static int digital_root(int n) {
    // ...
    String cadena=""+n;
    System.out.println(Integer.valueOf(cadena));
    int sumaParcial=cadena.chars().reduce(0, (suma, elemento) -> suma + Character.getNumericValue(elemento));
    return sumaParcial<10?sumaParcial:digital_root(sumaParcial);
  }

  public static void main(String[] args) {
    System.out.println(digital_root(387850));
  }
}
