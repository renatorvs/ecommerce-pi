package usuarios;

import static regrasnegocio.Impostos.COFINS;
import static regrasnegocio.Impostos.PIS;
import regrasnegocio.Tarifa;

/**
 *
 * @author 052021
 */
public class Rural extends Contribuinte{
    
    public Rural( int consumo ){
        super(consumo);
        super.setTarifa(Tarifa.RURAL);
    }
    
    @Override
    public void emitirBoleto(){
        System.out.println("*** USUÁRIO RURAL ***");
        super.emitirBoleto();
    }
    
    @Override
    public String toString(){
        String saida = "*** USUÁRIO RURAL ***\n";
        saida += super.toString();
        return saida;
    }
    
}
