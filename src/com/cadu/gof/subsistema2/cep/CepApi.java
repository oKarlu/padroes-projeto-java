package com.cadu.gof.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstacia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Sergipe";
    }

    public String recuperarEstado(String cep){
        return "PE";
    }
}
