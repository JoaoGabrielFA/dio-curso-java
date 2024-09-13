import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_14 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Desafio 14 - Encontre o maior número primo da lista:
    //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

    int maiorPrimo = numeros.stream().filter(n -> {
      for(int i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0){
          return false;
        }
      }
      return true;
    }).sorted((a, b) -> b - a).collect(Collectors.toList()).get(0);
  
    System.out.println(maiorPrimo);
  }
}
