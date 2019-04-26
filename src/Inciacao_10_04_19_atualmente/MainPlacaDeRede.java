package Inciacao_10_04_19_atualmente;

/**
 *
 * @author Rômulo
 */
public class MainPlacaDeRede {
    public static void main(String[] args) {
        PlacaDeRede placaDeRede = new PlacaDeRede();
        System.out.println(placaDeRede.getMac());
        PlacaDeRede placaDeRede2 = new PlacaDeRede();
        System.out.println(placaDeRede2.getMac());
        System.out.println(PlacaDeRede.getMacSequence());
    }
}
