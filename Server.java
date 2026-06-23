import java.util.HashMap;

public class Server {
    private HashMap<Integer, String> database;
    private HashMap<String,Command> commands = new HashMap<String,Command>();

    public void insert_database(Dados dados) {
        database.put(dados.id,dados.nome);
    }

    public void delete_database(int id) {
        database.remove(id);
    }

    public String get_database(int id) {
        return database.get(id).toString();
    }

    public String get_all_database() {
        return database.toString();
    }

    public Server() {
        this.database = new HashMap<Integer, String>();
        this.commands.put("new",new newCommand());
    }

    public void Service(String nome, Dados dados) {
        Command comando = this.commands.get(nome);
        System.out.println(comando.execute(dados));
    }
}
