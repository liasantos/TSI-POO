import java.util.Date;

public class Cliente extends User {
    public Date anoDeNascimento = new Date();

    public Boolean login(String email, String senha, Integer anoDeNascimento) {
        return super.login(email, senha) && anoDeNascimento.equals(this.anoDeNascimento);
    }
}
