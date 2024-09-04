package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
  private List<Livro> listaDeLivros;

  public CatalogoDeLivros() {
    this.listaDeLivros = new ArrayList<>();
  }

  public void AdicionarLivro(String titulo, String autor, int anoPublicacao) {
    listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosDoAutor = new ArrayList<>();
    if (!listaDeLivros.isEmpty()) {
      for (Livro livro : listaDeLivros) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          livrosDoAutor.add(livro);
        }
      }
    }
    return livrosDoAutor;
  }

  public List<Livro> PesquisarPorIntervaloDeAnos(int AnoInicial, int AnoFinal) {
    List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
    if (!listaDeLivros.isEmpty()) {
      for (Livro livro : listaDeLivros) {
        if (livro.getAnoPublicacao() >= AnoInicial && livro.getAnoPublicacao() <= AnoFinal) {
          livrosPorIntervaloDeAnos.add(livro);
        }
      }
    }
    return livrosPorIntervaloDeAnos;
  }

  public Livro PesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!listaDeLivros.isEmpty()) {
      for (Livro livro : listaDeLivros) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = livro;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoDeLivros catalogo = new CatalogoDeLivros();
    catalogo.AdicionarLivro("The Great Adventure", "John Doe", 1995);
    catalogo.AdicionarLivro("Mystery of the Lost Island", "Jane Smith", 2003);
    catalogo.AdicionarLivro("The Great Adventure", "John Doe", 1995);
    catalogo.AdicionarLivro("Science and You", "Albert Einstein", 1954);
    catalogo.AdicionarLivro("Cooking with Love", "Julia Child", 1961);
    catalogo.AdicionarLivro("Journey to the Stars", "Carl Sagan", 1980);
    catalogo.AdicionarLivro("The Art of Coding", "Ada Lovelace", 1843);
    catalogo.AdicionarLivro("Mastering Java", "James Gosling", 2000);
    catalogo.AdicionarLivro("The Science of Everything", "Carl Sagan", 1985);
    catalogo.AdicionarLivro("Adventures in Wonderland", "Lewis Carroll", 1865);
    catalogo.AdicionarLivro("The Hidden Truth", "George Orwell", 1949);
    catalogo.AdicionarLivro("Tales from the Unknown", "Isaac Asimov", 1951);
    catalogo.AdicionarLivro("The Journey Home", "Herman Melville", 1851);
    catalogo.AdicionarLivro("The World of Tomorrow", "Isaac Asimov", 1964);
    catalogo.AdicionarLivro("Life's Lessons", "Maya Angelou", 1969);
    catalogo.AdicionarLivro("Coding the Future", "Grace Hopper", 1952);
    catalogo.AdicionarLivro("The Stars Above", "Carl Sagan", 1973);
    catalogo.AdicionarLivro("Deep Blue", "Arthur C. Clarke", 1972);
    catalogo.AdicionarLivro("The Art of War", "Sun Tzu", 500);
    catalogo.AdicionarLivro("The Final Frontier", "Gene Roddenberry", 1966);

    System.out.println("\nLivros de Carl Sagan: " + catalogo.pesquisarPorAutor("Carl Sagan"));
    System.out.println("\nLivros dos anos 50: " + catalogo.PesquisarPorIntervaloDeAnos(1950, 1959));
    System.out.println("\nPesquisar 'The Great Adventure': " + catalogo.PesquisarPorTitulo("The Great Adventure"));
  }
}
