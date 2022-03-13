public class Turma {
    public String codigoTurma;
    public String nomeTurma;
    public Professor professor;
    public Sala sala;

    public void imprimir(){
        System.out.println("Código: " + codigoTurma);
        System.out.println("Nome: " + nomeTurma);
        System.out.println("Professor: " + professor.nome + " " + professor.sobrenome);
        System.out.println("Sala: " + sala.codigoSala + " " + sala.bloco);
    }

}
