/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author GENERATION 10
 */
public class WhatsappAdapter implements Notifier{
    private WhatsappService whatsappService;

    public WhatsappAdapter(WhatsappService service) {
        this.whatsappService = service;
    }

    @Override
    public void sendNotification(String message) {
        whatsappService.sendWhatsAppMessage(message);
    }
}
