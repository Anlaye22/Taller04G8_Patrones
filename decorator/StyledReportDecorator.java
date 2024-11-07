/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import factorymethod.Report;

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
