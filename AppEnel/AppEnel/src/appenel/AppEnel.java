dpackage appenel;

import java.util.Scanner;
import usuarios.BaixaRenda;
import usuarios.Residencial;
import usuarios.Rural;
import usuarios.Usuario;

/**
 * @author 052021
 */
public class AppEnel {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Consumo (kWh): ");
        int consumo = scan.nextInt();
        
        System.out.println("Selecione o Usuário");
        System.out.println("1 - Residencial");
        System.out.println("2 - Residencial de Baixa Renda");
        System.out.println("3 - Rural");
        System.out.println("4 - Outros");
        int opcao = scan.nextInt();
                
        Usuario user;
        switch(opcao){
            case 2 : user = new BaixaRenda(consumo);
                     user.emitirBoleto();
                     break;
            case 3 : user = new Rural(consumo);
                     user.emitirBoleto();
                     break;
            default : user = new Residencial(consumo);
                      user.emitirBoleto();
                      break;            
        }        
    }

}
