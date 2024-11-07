
package decorator;

import factorymethod.Report;

public class DecoratorFuente extends InformeDecorator {
    private String fuente;

    public DecoratorFuente(Report report, String fuente) {
        super(report);
        this.fuente = fuente;
    }

    @Override
    public void generate(String content) {
        System.out.println("Aplicando Fuente: " + fuente);
        report.generate(content);
    }
}