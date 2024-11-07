/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.taller04_patrones_g8;

/**
 *
 * @author GENERATION 10
 */
public class Taller04_patrones_G8 {
    
    
    // Ejemplo de USO

    public static void main(String[] args) {
        // Generación de un reporte PDF decorado
        ReportFactory pdfFactory = new PdfReportFactory();
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
