package IntermediateLevel;

public class Hokages {
    String nome;
    int idade;
    boolean Active;
    double altura;
    long saldoBanco;

    // NoArgs constructor
    public Hokages(){
        // Isso é um construtor vázio
    }

    public Hokages(String nome) {
        // construtor com argumentos
        this.nome = nome; // to passando o argumento nome, usuário precisa colocar o nome, estou referenciando o att nome láaaaaaa em cima
    }

    public Hokages(int idade){
        this.idade = idade;
    }


    // AllArgs constructor
    public Hokages(String nome, int idade, boolean Active) {
        this.nome = nome;
        this.idade = idade;
        this.Active = Active;
    }


    // Alt + Insert -> lista de constructors do IntelliJ, seleciono todos e clico no OK, para criar um constructor com td
    public Hokages(String nome, int idade, boolean active, double altura, long saldoBanco) {
        this.nome = nome;
        this.idade = idade;
        Active = active;
        this.altura = altura;
        this.saldoBanco = saldoBanco;
    }
}
