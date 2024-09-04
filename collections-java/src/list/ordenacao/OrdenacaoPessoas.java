package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

  private List<Pessoa> listaDePessoas;

  public OrdenacaoPessoas() {
    this.listaDePessoas = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    listaDePessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
    if (!listaDePessoas.isEmpty()) {
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
    if (!listaDePessoas.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adicionarPessoa("Albert Einstein", 76, 1.75);
    ordenacaoPessoas.adicionarPessoa("Marie Curie", 66, 1.63);
    ordenacaoPessoas.adicionarPessoa("Isaac Newton", 84, 1.70);
    ordenacaoPessoas.adicionarPessoa("Leonardo da Vinci", 67, 1.73);
    ordenacaoPessoas.adicionarPessoa("Charles Darwin", 73, 1.83);
    ordenacaoPessoas.adicionarPessoa("Ada Lovelace", 36, 1.65);
    ordenacaoPessoas.adicionarPessoa("Nikola Tesla", 86, 1.88);
    ordenacaoPessoas.adicionarPessoa("Galileo Galilei", 77, 1.73);
    ordenacaoPessoas.adicionarPessoa("Jane Austen", 41, 1.65);
    ordenacaoPessoas.adicionarPessoa("Mahatma Gandhi", 78, 1.65);

    System.out.println(ordenacaoPessoas.listaDePessoas);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}