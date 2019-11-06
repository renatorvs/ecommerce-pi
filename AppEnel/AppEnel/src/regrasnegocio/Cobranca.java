package regrasnegocio;

/**
 * @author 052021
 */
public interface Cobranca {
    
    final int MINIMO = 30;
    
    // Obrigatório: Mostrar o valor sem Impostos
    public float getValorBase();
    // Obrigatório: Emitir um boleto de cobrança
    public void emitirBoleto();
}
