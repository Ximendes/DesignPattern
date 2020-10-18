package com.design_pattern.chain_of_responsability_bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AplicaFormatoTest {

    private static final String titular = "Juca";
    private static final double saldo = 100.0;

    @Test
    public void deveTestarRespostaEmXML() {
        Conta conta = new Conta(titular, saldo);
        Requisicao requisicao = new Requisicao(Formato.XML);
        String formato = new AplicaFormato().aplica(requisicao, conta);
        assertEquals("<conta><titular>Juca</titular><saldo>100.0</saldo></conta>", formato);
    }

    @Test
    public void deveTestarRespostaEmCSV() {
        Conta conta = new Conta(titular, saldo);
        Requisicao requisicao = new Requisicao(Formato.CSV);
        String formato = new AplicaFormato().aplica(requisicao, conta);
        assertEquals("Juca,100.0", formato);
    }

    @Test
    public void deveTestarRespostaEmPorcento() {
        Conta conta = new Conta(titular, saldo);
        Requisicao requisicao = new Requisicao(Formato.PORCENTO);
        String formato = new AplicaFormato().aplica(requisicao, conta);
        assertEquals("Juca%100.0", formato);
    }

    @Test
    public void deveTestarSemResposta() {
        Conta conta = new Conta(titular, saldo);
        Requisicao requisicao = new Requisicao(Formato.PDF);
        String formato = new AplicaFormato().aplica(requisicao, conta);
        assertEquals("Juca100.0", formato);
    }
}