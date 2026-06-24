public interface Command {
    public Object execute(Dados dados);
}

class newCommand implements Command {
    Database db;

    public newCommand(Database database){
        this.db = database;
    }

    @Override
    public Object execute(Dados dados) {
        return db.insert_database(dados);
    }
}

class deleteCommand implements Command {
    Database db;

    public deleteCommand(Database database){
        this.db = database;
    }

    @Override
    public Object execute(Dados dados) {
        return db.delete_database(dados).toString();
    }
}


class getCommand implements Command {
    Database db;

    public getCommand(Database database){
        this.db = database;
    }

    @Override
    public Object execute(Dados dados) {
        return db.get_database(dados).toString();
    }
}

class getAllCommand implements Command {
    Database db;

    public getAllCommand(Database database){
        this.db = database;
    }

    @Override
    public Object execute(Dados dados) {
        return db.get_all_database().toString();
    }
}