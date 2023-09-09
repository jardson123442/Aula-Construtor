package classes;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public void imprimirDados(){
        System.out.printf(
            "O nome é %s, tem %d de idade e %.2fm de altura. \n",
            nome, 
            idade, 
            altura
        );
    }

    public Pessoa(String nome){
        System.out.println("Uma pessoa acaba de nascer! Parabens!");
        this.nome = nome;
        altura = 1.75f;
        idade = 21;
        imprimirDados();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //public Pessoa(String nome, int idade, float altura){
    //    this.nome = nome;
    //    this.idade = idade;
    //    this.altura = altura;
    //}

    

}