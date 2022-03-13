import java.util.ArrayList;

public class SerHumano {

    public String nome;

    public ArrayList<SerHumano> filhos = new ArrayList<>();

    public Boolean temFilhos() {
        return !filhos.isEmpty();
    }

    public SerHumano nasceuFilho(String nome) {
        SerHumano filho = new SerHumano();
        filho.nome = nome;
        filhos.add(filho);
        return filho;
    }

}
