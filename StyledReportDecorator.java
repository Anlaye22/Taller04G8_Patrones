/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller04_patrones_g8;

/**
 *
 * @author GENERATION 10
 */
public class StyledReportDecorator implements Report {
    protected Report decoratedReport;

    public StyledReportDecorator(Report report) {
        this.decoratedReport = report;
    }

    @Override
    public void generate(String content) {
        decoratedReport.generate(content);
    }
}
