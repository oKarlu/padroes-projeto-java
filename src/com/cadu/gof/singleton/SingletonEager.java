package com.cadu.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author oKarlu
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
