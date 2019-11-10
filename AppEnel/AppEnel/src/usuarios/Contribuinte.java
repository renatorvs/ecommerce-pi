package usuarios;

import regrasnegocio.Impostos;

/**
 *
 * @author 052021
 */
public class Contribuinte extends Usuario 
        implements Impostos {
    
    public Contribuinte(){
        super();
    }
    
    public Contribuinte(int consumo){
        super(consumo);
    }
    
    @Override
    public float getPIS(){
        return getValorBase() * PIS ;
    }
    @Override
    public float getCOFINS(){
        return getValorBase() * COFINS;
    }
    @Override
    public float getCOSIP(){
        return COSIP;
    }
    
    @Override
    public float getTotalImpostos(){
        return getPIS() + getCOFINS() + getCOSIP();
    }
    
    public float getTotal(){
        return getValorBase() + getTotalImpostos();
    }
    
    @Override
    public void emitirBoleto(){
        super.emitirBoleto();
        System.out.println();
        System.out.format("PIS (%.2f%%)      R$ %.2f%n",
                PIS*100, getPIS() );
        System.out.format("COFINS (%.2f%%)   R$ %.2f%n",
                COFINS*100, getCOFINS() );
        System.out.format("COSIP             R$ %.2f%n",
                getCOSIP() );
        System.out.format("Total de Impostos R$ %.2f%n" ,
                getTotalImpostos());
        System.out.format("Total Devido      R$ %.2f%n" ,
                getTotal());

    }
    
    @Override
    public String toString(){
        String saida = super.toString();
        String pis = String.format("PIS (%.2f%%)      R$ %.2f%n",
                PIS*100, getPIS() );
        String cofins = String.format("COFINS (%.2f%%)   R$ %.2f%n",
                COFINS*100, getCOFINS() );
        String cosip = String.format("COSIP             R$ %.2f%n",
                getCOSIP() );
        String impostos = String.format("Total de Impostos R$ %.2f%n" ,
                getTotalImpostos());
        String total = String.format("Total Devido      R$ %.2f%n" ,
                getTotal());
        saida += pis + cofins + cosip + impostos + total;
        return saida;
    } 
    
    
}
