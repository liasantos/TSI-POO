public class User {
    public  String email;
    public String nome;
    public String senha;

    public Boolean login(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public static void main(String[] args) {
        User usuario = new User();
        usuario.email = "joaozinho666@gmail.lol";
        usuario.nome = "João";
        usuario.senha = "melancia123";

        usuario.login("joaozinho666@gmail.lol", "melancia123");
    }
}