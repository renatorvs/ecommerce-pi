package usuarios;

import regrasnegocio.Tarifa;

/**
 *
 * @author 052021
 */
public class Residencial extends Contribuinte {
    
    public Residencial( int consumo ){
        super(consumo);
        super.setTarifa(Tarifa.RESIDENCIAL);
    }
    
    @Override
    public void emitirBoleto(){
        System.out.println("*** USUÁRIO RESIDENCIAL ***");
        super.emitirBoleto();
    }
    
    @Override
    public String toString(){
        String saida = "*** USUÁRIO RESIDENCIAL ***\n";
        saida += super.toString();
        return saida;
    }   
    
}
