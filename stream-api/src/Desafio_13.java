import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_13 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    // Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
  
    List<Integer> intervaloNumeros = numeros.stream().limit(9).skip(6).collect(Collectors.toList());
    System.out.println(intervaloNumeros);
  }
}