package Inciacao_10_04_19_atualmente;

/**
 *
 * @author Rômulo
 */
public class PlacaDeRede {
    private int mac;
    private String ip;
    private static int macSequence;
    public PlacaDeRede(){
        mac = ++macSequence;
    }
    
    public void setIp(String ip){
        this.ip = ip;
    }
    public int getMac(){
        return mac;
    }
}
