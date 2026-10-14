/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexibabilonia.seminario.combustible.rmi.net;

import java.io.IOException;

import alexibabilonia.seminario.combustible.rmi.lib.IRemotaCalculoCombustible;

import net.sf.lipermi.exception.LipeRMIException;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Server;

public class Servidor {

    private int puerto = 9007;

    private CallHandler invocador;
    private Server servidor;

    private CalculoRmiCombustibleImplem calculoCombustible;

    public Servidor() {
        invocador = new CallHandler();
        servidor = new Server();

        calculoCombustible = new CalculoRmiCombustibleImplem();
    }

    public void iniciar() throws Exception {

        try {
            invocador.registerGlobal(
                    IRemotaCalculoCombustible.class,
                    calculoCombustible);

            servidor.bind(puerto, invocador);

            System.out.println(
                    "Servidor de combustible iniciado en el puerto "
                    + puerto);

            System.out.println(
                    "Esperando solicitudes del cliente...");

        } catch (LipeRMIException ex) {
            throw new Exception(
                    "Error al registrar el metodo remoto", ex);

        } catch (IOException ex) {
            throw new Exception(
                    "Error al iniciar el servidor", ex);
        }
    }

    public void detener() {
        servidor.close();

        System.out.println("Servidor detenido.");
    }
}