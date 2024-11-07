/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller04g8_patrones;

import adapter.EmailNotifier;
import adapter.Notifier;
import adapter.WhatsappAdapter;
import adapter.WhatsappService;
import decorator.ColorDecorator;
import decorator.FontStyleDecorator;
import factorymethod.PdfReportGenerator;
import factorymethod.Report;
import factorymethod.ReportGenerator;

/**
 *
 * @author GENERATION 10
 */
public class Taller04_patrones_G8 {
    
    
    // Ejemplo de USO

    public static void main(String[] args) {
        // Generación de un reporte PDF decorado
        ReportGenerator pdfFactory = new PdfReportGenerator();
        Report report = pdfFactory.createReport();

        // Decoración de estilos
        report = new FontStyleDecorator(report, "Bold");
        report = new ColorDecorator(report, "Red");

        // Generación del reporte con estilos aplicados
        report.generate("Reporte de ejemplo");

        // Envío de notificación por diferentes medios
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.sendNotification("Reporte generado");

        Notifier whatsappNotifier = new WhatsappAdapter(new WhatsappService());
        whatsappNotifier.sendNotification("Reporte generado");
    } 
}
