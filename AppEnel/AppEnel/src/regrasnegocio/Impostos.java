package regrasnegocio;

/**
 *
 * @author 052021
 */
public interface Impostos {
    
    final float PIS    = 0.0107f;   // 1,07 %
    final float COFINS = 0.0491f;   // 4,91% 
    final float COSIP  = 8.19f;     // R4 8,19
    
    public float getPIS();
    public float getCOFINS();
    public float getCOSIP();
    
    public float getTotalImpostos();
    
}
