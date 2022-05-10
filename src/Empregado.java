public class Empregado{
    //Declaração de variáveis
    private String nome, sobrenome;
    private float salario;


    //Construtores
    public Empregado(){

    }

    public Empregado(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }


    //Métodos setters e getters nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    //Métodos setters e getters sobrenome
    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Métodos setters e getters salario
    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Juntar nome e sobrenome
    public String getNomeESobrenome(){
        //Declaração e atribuição de váriáveis
        String nomeESobrenome = this.nome + " " + this.sobrenome;
        return nomeESobrenome;
    }

    //Reajuste Salarial
    public void reajusteSalarial(){
        this.salario += this.salario*0.1;
    }

}