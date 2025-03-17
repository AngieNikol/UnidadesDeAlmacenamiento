/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author N
 */
public class UnidadesDeDatos {
    
    private static final Map<String, Double> siMultipliers = new HashMap<>();
    private static final Map<String, Double> iecMultipliers = new HashMap<>();
    
    public UnidadesDeDatos(){
        // Sistema Decimal (SI)
        siMultipliers.put("b", 1.0);
        siMultipliers.put("kb", 1e3);
        siMultipliers.put("Mb", 1e6);
        siMultipliers.put("Gb", 1e9);
        siMultipliers.put("Tb", 1e12);
        siMultipliers.put("Pb", 1e15);
        siMultipliers.put("Eb", 1e18);
        siMultipliers.put("Zb", 1e21);
        siMultipliers.put("Yb", 1e24);

        siMultipliers.put("B", 8.0);
        siMultipliers.put("kB", 8e3);
        siMultipliers.put("MB", 8e6);
        siMultipliers.put("GB", 8e9);
        siMultipliers.put("TB", 8e12);
        siMultipliers.put("PB", 8e15);
        siMultipliers.put("EB", 8e18);
        siMultipliers.put("ZB", 8e21);
        siMultipliers.put("YB", 8e24);

        // Sistema Binario (IEC)
        iecMultipliers.put("b", 1.0);
        iecMultipliers.put("Kib", 1024.0);
        iecMultipliers.put("Mib", Math.pow(1024, 2));
        iecMultipliers.put("Gib", Math.pow(1024, 3));
        iecMultipliers.put("Tib", Math.pow(1024, 4));
        iecMultipliers.put("Pib", Math.pow(1024, 5));
        iecMultipliers.put("Eib", Math.pow(1024, 6));
        iecMultipliers.put("Zib", Math.pow(1024, 7));
        iecMultipliers.put("Yib", Math.pow(1024, 8));

        iecMultipliers.put("B", 8.0);
        iecMultipliers.put("KiB", 8 * 1024.0);
        iecMultipliers.put("MiB", 8 * Math.pow(1024, 2));
        iecMultipliers.put("GiB", 8 * Math.pow(1024, 3));
        iecMultipliers.put("TiB", 8 * Math.pow(1024, 4));
        iecMultipliers.put("PiB", 8 * Math.pow(1024, 5));
        iecMultipliers.put("EiB", 8 * Math.pow(1024, 6));
        iecMultipliers.put("ZiB", 8 * Math.pow(1024, 7));
        iecMultipliers.put("YiB", 8 * Math.pow(1024, 8));
    }
    
 public double convertir(double num, String entrada, String salida) {
        double bits;

        if (siMultipliers.containsKey(entrada)) {
            bits = num * siMultipliers.get(entrada);
        } else if (iecMultipliers.containsKey(entrada)) {
            bits = num * iecMultipliers.get(entrada);
        } else {
            throw new IllegalArgumentException("Unidad de origen no válida.");
        }

        if (siMultipliers.containsKey(salida)) {
            return bits / siMultipliers.get(salida);
        } else if (iecMultipliers.containsKey(salida)) {
            return bits / iecMultipliers.get(salida);
        } else {
            throw new IllegalArgumentException("Unidad de destino no válida.");
        }
    }
}