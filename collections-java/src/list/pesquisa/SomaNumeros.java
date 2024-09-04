package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;
        if(!numeros.isEmpty()){
            for (int numero : numeros) {
                somaTotal += numero;
            }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for (int numero : numeros) {
                if(maiorNumero < numero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (int numero : numeros) {
                if(menorNumero > numero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(9);

        System.out.println("\nA soma total é: " + somaNumeros.calcularSoma());
        System.out.println("\nO maior numero é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("\nO menor numero é: " + somaNumeros.encontrarMenorNumero());
        System.out.println("\nOs numeros são: " + somaNumeros.exibirNumeros());
    }
}