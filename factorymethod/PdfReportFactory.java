/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author GENERATION 10
 */
public class PdfReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new PdfReport();
    }
}
