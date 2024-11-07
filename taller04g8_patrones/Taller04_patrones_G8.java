/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller04g8_patrones;

import adapter.EmailNotifier;
import adapter.Notificacion;
import adapter.WhatsappAdapter;
import adapter.WhatsappService;
import decorator.DecoratorColor;
import decorator.DecoratorFuente;
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
        ReportGenerator pdfGenerator= new PdfReportGenerator();
        Report report = pdfGenerator.createReport();

        // Decoración de estilos
        report = new DecoratorFuente(report, "Bold");
        report = new DecoratorColor(report, "Red");

        // Generación del reporte con estilos aplicados
        report.generate("Reporte de ejemplo");

        // Envío de notificación por diferentes medios
        Notificacion emailNotifier = new EmailNotifier();
        emailNotifier.enviarNotification("Reporte generado");

        Notificacion whatsappNotifier = new WhatsappAdapter(new WhatsappService());
        whatsappNotifier.enviarNotification("Reporte generado");
    } 
}
