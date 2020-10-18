package com.design_pattern.chain_of_responsability_bank;

public class SemResposta implements Resposta {

    @Override
    public String responde(Requisicao req, Conta conta) {
        return conta.getTitular() + conta.getSaldo();
    }

    @Override
    public void setProxima(Resposta resposta) {
        // Do nothing
    }
}
