/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexibabilonia.seminario.combustible.rmi.net;

import alexibabilonia.seminario.combustible.rmi.lib.DatosCombustible;
import alexibabilonia.seminario.combustible.rmi.lib.IRemotaCalculoCombustible;

public class CalculoRmiCombustibleImplem
        implements IRemotaCalculoCombustible {

    @Override
    public DatosCombustible calcularRendimiento(
            DatosCombustible datos) {

        float kilometros = datos.getKilometros();
        float litros = datos.getLitros();

        if (litros <= 0 || kilometros < 0) {
            throw new IllegalArgumentException(
                    "Los datos ingresados no son validos");
        }

        float rendimiento = kilometros / litros;

        datos.setResultado(rendimiento);

        return datos;
    }
}