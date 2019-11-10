package usuarios;

import regrasnegocio.Cobranca;
import regrasnegocio.Tarifa;

/**
 * @author 052021
 */
public abstract class Usuario implements Cobranca {
    
    private int consumo;
    protected Tarifa tarifa;
    
    public Usuario(){
        this.consumo = MINIMO;
    }
    
    public Usuario( int consumo ){
        this.consumo = (consumo < MINIMO)? MINIMO : consumo;
    }
    
    public int getConsumo(){
        return this.consumo;
    }
    
    public void setConsumo(int consumo){
        this.consumo = consumo;
    }
    
    public float getTarifa(){
        return tarifa.getTE() + tarifa.getTUSD();
    }
    
    public void setTarifa(Tarifa tarifa ){
        this.tarifa = tarifa;
    }
    
    @Override
    public float getValorBase(){
        return getConsumo() * getTarifa();
    }
    
    @Override
    public void emitirBoleto(){
        System.out.println("*** CONTA DE LUZ *** Enel ***");
        System.out.println("Consumo (kWh): " + getConsumo() );
        System.out.format("Tarifa de Energia R$ %.5f %n " ,
                tarifa.getTE());
        System.out.format("Distribuição      R$ %.5f %n " ,
                tarifa.getTUSD());
        System.out.format("Valor Base        R$ %.5f %n " ,
                this.getValorBase());
    }  
    
    @Override
    public String toString(){
        String saida = "*** CONTA DE LUZ ***\n*** Enel ***";
        saida += "\nConsumo (kWh): " + getConsumo() ;
        String TE = String.format("\nTarifa de Energia R$ %.5f %n " ,
                tarifa.getTE());
        String TUSD = String.format("Distribuição      R$ %.5f %n " ,
                tarifa.getTUSD());
        String base = String.format("Valor Base        R$ %.5f %n " ,
                this.getValorBase());
        saida += TE + TUSD + base;
        return saida;
    }    
}
