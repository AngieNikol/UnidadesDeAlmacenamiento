/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Modelo.UnidadesDeDatos;

/**
 *
 * @author N
 */
public class Test {

    public static void main(String[] args) {
        UnidadesDeDatos conversion = new UnidadesDeDatos();

        System.out.println("=== Test de conversionSI ===");
        System.out.println(conversion.conversionSI(567, 3, 9)); // KB a GB

        System.out.println("=== Test de conversion ISO ===");
        System.out.println(conversion.conversionISO(3425, 20, 40)); //MiB a TiB

        System.out.println("=== Test de conversion SI a ISO ===");
        System.out.println(conversion.conversionSIaISO(1345, 3, 40)); // De KB a TiB

        System.out.println("=== Test de conversion ISO a SI ===");
        System.out.println(conversion.conversionISOaSI(1562, 20, 9)); // De MiB a GB

        System.out.println("=== Test de conversion Bibits ===");
        System.out.println(conversion.conversionBibits(1048, 0, 40)); // b a Tb (tebibits)
        System.out.println(conversion.conversionBibits(1048, 40, 10)); // Tb a Kb (kibibits)
        
        System.out.println("=== Test de conversion Bits ===");
        System.out.println(conversion.conversionBits(1048, 3, 12)); // KB a TB (Terabits)
        System.out.println(conversion.conversionBits(1048, 12, 3)); // TB a Kb (Kiloibits)
        
        System.out.println("=== Test de conversion Bibits a Bits ===");
        System.out.println(conversion.conversionBibitsABits(523, 10, 9)); // Kibibits a Gigabits

        System.out.println("=== Test de conversion Bits a Bibits ===");
        System.out.println(conversion.conversionBitsABibits(203, 6, 40)); // Megabits a Tebibits

        System.out.println("=== Test de conversion Bits A Bibytes ===");
        System.out.println(conversion.conversionBitsABibytes(8589, 6, 30)); // MegaBits a GiBibytes

        System.out.println("=== Test de conversion Bibytes A Bits ===");
        System.out.println(conversion.conversionBibytesABits(6753, 40, 3)); // TeBibytes a KiloBits
    }
}
