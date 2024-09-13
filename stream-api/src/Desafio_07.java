import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_07 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Desafio 7 - Encontrar o segundo número maior da lista:
    // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

    int segundoMaiorNumero = numeros.stream().sorted((a, b) -> b - a).distinct().skip(1).collect(Collectors.toList()).get(0);
    System.out.println(segundoMaiorNumero);
  }
}
