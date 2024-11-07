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
public class ColorDecorator extends StyledReportDecorator {
    private String color;

    public ColorDecorator(Report report, String color) {
        super(report);
        this.color = color;
    }

    @Override
    public void generate(String content) {
        System.out.println("Applying color: " + color);
        super.generate(content);
    }
}
