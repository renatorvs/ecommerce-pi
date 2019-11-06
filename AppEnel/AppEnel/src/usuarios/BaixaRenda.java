package usuarios;

import static regrasnegocio.Impostos.COFINS;
import static regrasnegocio.Impostos.PIS;
import regrasnegocio.Tarifa;

/**
 *
 * @author 052021
 */
public class BaixaRenda extends Contribuinte {
    
    public BaixaRenda( int consumo ){
        //super(consumo);
        super.setConsumo(consumo);
        this.setTarifa( );
    }  


    public final void setTarifa(){
        int consumo = getConsumo();
        if (consumo <= 30)
            tarifa = Tarifa.SOCIAL_000_030;
        else if (consumo <= 100)
            tarifa = Tarifa.SOCIAL_031_100;
        else if (consumo <=220)
            tarifa = Tarifa.SOCIAL_101_220;
        else
            tarifa = Tarifa.SOCIAL_221;
    }
    
    @Override
    public void emitirBoleto(){
        System.out.println("*** USUÁRIO DE BAIXA RENDA ***");
        super.emitirBoleto();
    }
    
    
    @Override
    public String toString(){
        String saida = "*** USUÁRIO DE BAIXA RENDA ***\n";
        saida += super.toString();
        return saida;
    }   
    
    
}
