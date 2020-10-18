package com.design_pattern.chain_of_responsability_bank;

public class AplicaFormato {

    public String aplica(Requisicao requisicao, Conta conta) {

        RespostaEmXml xml = new RespostaEmXml();
        RespostaEmCsv csv = new RespostaEmCsv();
        RespostaEmPorcento porcento = new RespostaEmPorcento();
        SemResposta semResposta = new SemResposta();

        xml.setProxima(csv);
        csv.setProxima(porcento);
        porcento.setProxima(semResposta);

        return xml.responde(requisicao, conta);
    }
}
