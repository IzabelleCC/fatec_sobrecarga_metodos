public class TestePessoa {
    public static void main(String[] args) {
        var p1 = new Pessoa("Maria", 23);
        var p2 = new Pessoa();
    }
}

class Pessoa{
    private String nome;
    private int idade;

    Pessoa(){}
    Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    Pessoa(int idade, String nome){
        this(nome, idade);
    }
    Pessoa(int idade){
        this(null,idade);
    }
    Pessoa( String nome){
        this(nome, 0);
    }

}

class Personagem{
    final static int VALOR_ENERGIA_PADRAO = 10;
    final static int VALOR_FOME_PADRAO = 0;
    final static int VALOR_SONO_PADRAO = 0;
    String nome;
    int energia, fome, sono;
    Personagem(){
        this(null,VALOR_FOME_PADRAO, VALOR_FOME_PADRAO, VALOR_SONO_PADRAO);
    }
    Personagem(String nome){
        this(nome, VALOR_ENERGIA_PADRAO, VALOR_FOME_PADRAO, VALOR_SONO_PADRAO);
    }
    Personagem(String nome, int energia, int fome, int sono){
        super();
        this.nome = nome;
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }
}
