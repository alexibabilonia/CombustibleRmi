/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexibabilonia.seminario.combustible.rmi.lib;

import java.io.Serializable;

public class DatosCombustible implements Serializable {

    private float kilometros;
    private float litros;
    private float resultado;

    public DatosCombustible() {
    }

    public DatosCombustible(float kilometros, float litros) {
        this.kilometros = kilometros;
        this.litros = litros;
    }

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}
