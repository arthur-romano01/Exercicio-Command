import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Server server = new Server();

        System.out.println("Digite EXIT para finalizar.");

        while(true){
            String token[] = sc.nextLine().trim().split("\\s+");

            //condição de saida do loop
            if(token[0].equals("EXIT")){
                sc.close();
                break;
            }

            int qtdTokens = token.length;

            Dados dado = switch (qtdTokens) { 
                case 3 -> new Dados(); //dado vazio;
                case 4 -> new Dados(Integer.parseInt(token[3]));
                case 5 -> new Dados(Integer.parseInt(token[3]),token[4]);
                default -> null;
            };
            if (dado == null) {
                System.err.println("Quantidade de tokens diferente do esperado (entre 3 e 5)");
                continue;
            }

            String commando = token[2];
            System.out.println(server.Service(commando, dado).toString());
        }
        sc.close();        
    }    
}


/*
java BancoPessoas new 1 Joao
java BancoPessoas new 2 Maria
java BancoPessoas get 1
java BancoPessoas all
java BancoPessoas delete 1
java BancoPessoas get 1
java BancoPessoas delete 2
java BancoPessoas get 2
java BancoPessoas all
*/