public class App {
    public static void main(String[] args) throws Exception {
        Empregado empregado;
        //Construtor com todos os parâmetros        
        empregado = new Empregado("Luiz", "Francisco", 1214.2f);

        //Construtor sem parâmetros - EXEMPLO
        Empregado empregado1;
        empregado1 = new Empregado();

        //Mostrando Nome e Sobrenome versão 1 
        String mensagem = empregado.getNomeESobrenome();
        System.out.println(mensagem);

        //Mostrando Nome e Sobrenome versão 2
        System.out.println(empregado.getNomeESobrenome());

        //Mostrando Salário versão 1
        // mensagem = (String) empregado.getSalario();
        mensagem = "Salário: R$ "+ empregado.getSalario();
        System.out.println(mensagem);

        //Mostrando salário versão 2
        System.out.println(empregado.getSalario());

        //Reajuste
        empregado.reajusteSalarial();

        //Mostrando salário
        System.out.println("Novo salário: R$ "+ empregado.getSalario());
    }
}
