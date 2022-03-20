public class Admin extends User {
    public Integer cod = 0;

    public Boolean login(String email, String senha, Integer cod) {
        boolean logou = super.login(email, senha) && cod.equals(this.cod);
        if(logou){
            this.cod++;
        }
        return logou;
    }
}
