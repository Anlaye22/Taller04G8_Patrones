/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;


/**
 *
 * @author GENERATION 10
 */
public class TelegramAdapter implements Notificacion{
    private TelegramService telegramService;

    public TelegramAdapter(TelegramService service) {
        this.telegramService = service;
    }

    @Override
    public void enviarNotification(String message) {
        telegramService.enviarNotificationTelegramMessage(message);
    }
}
