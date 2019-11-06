package regrasnegocio;

/**
 * @author 052021
 */
public enum Tarifa {

    RESIDENCIAL (0.00f),
    SOCIAL_000_030 (0.65f),
    SOCIAL_031_100 (0.40f),
    SOCIAL_101_220 (0.10f),
    SOCIAL_221 (0.00f),
    RURAL (0.20f),
    PUBLICO (0.40f),
    OUTROS (0.00f);

    Tarifa(float desconto){
        TE = TE_PLENA*(1 - desconto);
        TUSD = TUSD_PLENA*(1 - desconto);
    }

    private final float TE_PLENA   = 0.25888f;
    private final float TUSD_PLENA = 0.25971f;
    private final float TE;
    private final float TUSD;
    
    public float getTE(){
        return TE;
    }
    
    public float getTUSD(){
        return TUSD;
    }
    
}
