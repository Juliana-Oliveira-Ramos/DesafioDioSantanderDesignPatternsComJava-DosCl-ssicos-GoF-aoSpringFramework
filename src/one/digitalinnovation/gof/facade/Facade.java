package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        //integrações com os subsistema

        String cidade =CepApi.getInstancia().recupraCidade(cep);
        String estado =CepApi.getInstancia().recuperaEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
