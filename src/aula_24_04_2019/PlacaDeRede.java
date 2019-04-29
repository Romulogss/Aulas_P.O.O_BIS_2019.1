package aula_24_04_2019;

/**
 *
 * @author Rômulo
 */
public class PlacaDeRede {

    private final int mac;
    private String ip;
    private static int macSequence;

    public PlacaDeRede() {
        mac = ++macSequence;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getMac() {
        return mac;
    }

    public static int getMacSequence() {
        return macSequence;
    }
    
    
}
