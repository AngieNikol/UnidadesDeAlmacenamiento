/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachada;

import Modelo.UnidadesDeDatos;

/**
 *
 * @author Angie Nikol Ortiz Amaya - 1152348 y Daniela García Peñaranda - 1152365
 * 1152365
 */
public class FachadaDatos {

    private UnidadesDeDatos unidades;

    public FachadaDatos() {
        this.unidades = new UnidadesDeDatos();
    }

    public double convertir(String tipoConversion, double valor, String entrada, String salida) {

        if (tipoConversion.equals("BytesABits")) {
            return unidades.convertir(valor, entrada, salida);
        } else if (tipoConversion.equals("BitsABytes")) {
            return unidades.convertir(valor, entrada, salida);
        } else if (tipoConversion.equals("Iguales")) {
            return unidades.convertir(valor, entrada, salida);
        }

        throw new IllegalArgumentException("Tipo de conversión no válido: " + tipoConversion);

    }

}
