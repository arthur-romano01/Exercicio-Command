import java.util.HashMap;

public class Server {
    
    private HashMap<String,Command> commands = new HashMap<String,Command>();
    private Database database;
    public Server() {
        this.database = new Database();
        this.commands.put("new",new newCommand(this.database));
        this.commands.put("delete",new deleteCommand(this.database));
        this.commands.put("all",new getAllCommand(this.database));
        this.commands.put("get",new getCommand(this.database));
    }

    public Object Service(String nome, Dados dados) {
        try {
            Command comando = this.commands.get(nome);
            return comando.execute(dados);
            
        } catch (Exception e) {
            return "Erro ao executar comando: "+e;

        }
    }
}
