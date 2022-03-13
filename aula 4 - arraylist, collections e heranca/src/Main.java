public class Main {

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.codigoTurma = "INF2AT-POO";
        turma1.nomeTurma = "Programação Orientada a Objetos";
        Professor professor1 = new Professor();
        professor1.nome = "Arlindo";
        professor1.sobrenome = "de Jesus";
        turma1.professor = professor1;
        Sala sala1 = new Sala();
        sala1.bloco = "Bloco 17";
        sala1.codigoSala = "Lab 6";
        turma1.sala = sala1;

        turma1.imprimir();

        SerHumano sh = new SerHumano();
        sh.temFilhos(); // false



    }
}
