/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller04_patrones_g8;

/**
 *
 * @author GENERATION 10
 */
public class EmailNotifier implements Notifier {
     @Override
     public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
        // Lógica para envío de correo
    }
}
