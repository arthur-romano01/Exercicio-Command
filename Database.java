import java.util.HashMap;

public class Database {
    private HashMap<Integer, String> database = new HashMap<Integer, String>();

    public Object insert_database(Dados dados) {
        try {
            database.put(dados.id,dados.nome);
        } catch (Exception e) {
            return "Insert NOK" + e;
        }
        
        return "Insert OK";
    }

    public Object delete_database(Dados dados) {
        try {
            database.remove(dados.id);
        } catch (Exception e) {
            return "Delete NOK "+ e;
        }
        return "Delete Ok";        
    }

    public Object get_database(Dados dados) {
        try {
            Object res = database.get(dados.id);
            if (res == null) {
                return "ID: "+dados.id+" NOT FOUND";
            }
            return res.toString(); 
        } catch (Exception e) {
            return "Get Via ID NOK "+ e;
        }
    }

    public Object get_all_database() {
        try {
            if (database.isEmpty()) {
                return "EMPTY DATA BASE";
            }
            return database.toString();
        } catch (Exception e) {
            return "Get All NOK"+ e;
        }
    }
    
}
