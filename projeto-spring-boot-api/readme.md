## Projeto Spring Boot API
Projeto feito em Java utilizando Spring Boot e Railway para publicar uma API. 

## Diagrama de Classes:

```mermaid
classDiagram
    class Filme {
        - String titulo
        - int anoLancamento
        - String[] generos
        - Diretor diretor
        - int duracaoMinutos
    }

    class Diretor {
        - String nome
        - int idade
    }

    Filme --> Diretor
```
