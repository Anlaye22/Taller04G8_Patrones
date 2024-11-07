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
public class DecoratorEstilo extends InformeDecorator {
    private String estilo;

    public DecoratorEstilo(Report report, String estilo) {
        super(report);
        this.estilo = estilo;
    }

    @Override
    public void generate(String content) {
        System.out.println("Aplicando Estilo: " + estilo);
        report.generate(content);
    }

}
