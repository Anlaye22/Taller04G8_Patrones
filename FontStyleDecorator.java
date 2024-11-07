/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller04_patrones_g8;

/**
 *
 * @author GENERATION 10
 */
public class FontStyleDecorator extends StyledReportDecorator {
private String fontStyle;

    public FontStyleDecorator(Report report, String fontStyle) {
        super(report);
        this.fontStyle = fontStyle;
    }

    @Override
    public void generate(String content) {
        System.out.println("Applying font style: " + fontStyle);
        super.generate(content);
    }
}