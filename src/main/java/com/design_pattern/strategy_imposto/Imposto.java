package com.design_pattern.strategy_imposto;

public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {
        this.outroImposto = null;
    }

    public abstract double calcula(Orcamento orcamento);

    protected double calculoDoOutroImposto(Orcamento orcamento) {
        return outroImposto != null ? outroImposto.calcula(orcamento) : 0;
    }

}
