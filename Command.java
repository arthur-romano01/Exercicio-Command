public interface Command {
    public Object execute(Dados dados);
}

class newCommand implements Command {
    @Override
    public Object execute(Dados dados) {
        
        return null;
    }
}