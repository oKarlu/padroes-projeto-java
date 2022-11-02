package com.cadu.gof.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author oKarlu
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
