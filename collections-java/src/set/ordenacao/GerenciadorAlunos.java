package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunos;

  public GerenciadorAlunos() {
    this.alunos = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunos.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    Aluno alunoParaRemover = null;
    if (!alunos.isEmpty()) {
      for (Aluno aluno : alunos) {
        if (aluno.getMatricula() == matricula) {
          alunoParaRemover = aluno;
        }
      }
    } else {
      System.out.println("A lista de alunos está vazia!");
    }
    if (alunoParaRemover == null) {
      System.out.println("Aluno não encontrado");
    }
    alunos.remove(alunoParaRemover);
  }

  public void exibirAlunos() {
    if (!alunos.isEmpty()) {
      System.out.println(alunos);
    } else {
      System.out.println("A lista de alunos está vazia!");
    }
  }

  public Set<Aluno> exibirAlunosPorNome() {
    if (!alunos.isEmpty()) {
      Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
      return alunosPorNome;
    } else {
      System.out.println("A lista de alunos está vazia!");
      return null;
    }
  }

  public Set<Aluno> exibirAlunosPorNota() {
    if (!alunos.isEmpty()) {
      Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
      alunosPorNota.addAll(alunos);
      return alunosPorNota;
    } else {
      System.out.println("A lista de alunos está vazia!");
      return null;
    }

  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    gerenciadorAlunos.adicionarAluno("Harry Potter", (long) 1000, 7.5);
    gerenciadorAlunos.adicionarAluno("Hermione Granger", (long) 1001, 9.8);
    gerenciadorAlunos.adicionarAluno("Ron Weasley", (long) 1002, 7.0);
    gerenciadorAlunos.adicionarAluno("Draco Malfoy", (long) 1003, 6.5);
    gerenciadorAlunos.adicionarAluno("Luna Lovegood", (long) 1004, 8.7);
    gerenciadorAlunos.adicionarAluno("Neville Longbottom", (long) 1005, 7.2);
    gerenciadorAlunos.adicionarAluno("Ginny Weasley", (long) 1006, 8.5);
    gerenciadorAlunos.adicionarAluno("Cedric Diggory", (long) 1007, 8.0);
    gerenciadorAlunos.adicionarAluno("Cho Chang", (long) 1008, 7.8);
    gerenciadorAlunos.adicionarAluno("Dean Thomas", (long) 1009, 7.3);
    gerenciadorAlunos.adicionarAluno("Seamus Finnigan", (long) 1010, 7.1);

    gerenciadorAlunos.exibirAlunos();
    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
  }
}