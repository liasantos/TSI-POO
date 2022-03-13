import java.util.Scanner;

public class Teste {

    public String nome;

    public static void main(String[] args) {
        Teste pessoa;
        pessoa = new Teste();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        pessoa.nome = leitor.nextLine();
        System.out.println(pessoa.nome);
    }
}
