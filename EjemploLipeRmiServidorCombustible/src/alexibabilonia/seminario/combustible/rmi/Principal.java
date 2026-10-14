/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexibabilonia.seminario.combustible.rmi;

import alexibabilonia.seminario.combustible.rmi.net.Servidor;

public class Principal {

    public static void main(String[] args) {

        try {
            Servidor servidor = new Servidor();

            servidor.iniciar();

        } catch (Exception ex) {
            System.out.println(
                    "Error al iniciar el servidor: "
                    + ex.getMessage());

            ex.printStackTrace();
        }
    }
}