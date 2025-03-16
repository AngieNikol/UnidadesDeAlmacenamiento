/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

/**
 *
 * @author N
 */
public class UnidadesDeDatos {

    public double conversionSI(double num, int potencia1, int potencia2) {
        double multiplicacion = num * Math.pow(10, potencia1);
        double resultado = multiplicacion / Math.pow(10, potencia2);
        return resultado;
    }

    public double conversionISO(double num, int potencia1, int potencia2) {
        double multiplicacion = num * Math.pow(2, potencia1);
        double resultado = multiplicacion / Math.pow(2, potencia2);
        return resultado;
    }

    public double conversionSIaISO(double num, int potencia1, int potencia2) {
        double multiplicacion = num * Math.pow(10, potencia1);
        double resultado = multiplicacion / Math.pow(2, potencia2);
        return resultado;
    }

    public double conversionISOaSI(double num, int potencia1, int potencia2) {
        double multiplicacion = num * Math.pow(2, potencia1);
        double resultado = multiplicacion / Math.pow(10, potencia2);
        return resultado;
    }

    public double conversionBibits(double num, int potencia1, int potencia2) {
        if (potencia1 > potencia2) {
            return num * Math.pow(2, potencia1 - potencia2);
        } else {
            return num / Math.pow(2, potencia2 - potencia1);
        }
    }

    public double conversionBits(double num, int potencia1, int potencia2) {
        if (potencia1 > potencia2) {
            return num * Math.pow(10, potencia1 - potencia2);
        } else {
            return num / Math.pow(10, potencia2 - potencia1);
        }
    }

    public double conversionBibitsABits(double num, int potencia1, int potencia2) {
       return  num*(Math.pow(2, potencia1)/ Math.pow(10, potencia2));
    }

    public double conversionBitsABibits(double num, int potencia1, int potencia2) {
       return num*(Math.pow(10, potencia1)/ Math.pow(2, potencia2));
       
    }

    public double conversionBitsABibytes(double num, int potencia1, int potencia2) {
        return num*(Math.pow(10, potencia1)/ Math.pow(2, potencia2));
    }

    public double conversionBibytesABits(double num, int potencia1, int potencia2) {
        return  num*(Math.pow(2, potencia1)/ Math.pow(10, potencia2));
    }

    public double conversionBitsABytes(double num) {
        return num / 8;
    }

    public double conversionBytesABits(double num) {
        return num * 8;
    }
}
