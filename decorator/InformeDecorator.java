package decorator;

import factorymethod.Report;

public abstract class InformeDecorator implements Report {
    protected Report report;

    public InformeDecorator(Report report) {
        this.report= report;
    }

    public abstract void generate(String content);
}
