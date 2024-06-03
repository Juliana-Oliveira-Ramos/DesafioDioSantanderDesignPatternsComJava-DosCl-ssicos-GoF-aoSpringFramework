package one.digitalinnovation.gof.subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia(){

        return instancia;
    }


    public String recupraCidade(String cidade ){
        return  "Araraquara";
    }

    public String recuperaEstado(String cep ){
        return  "SP";
    }
}

