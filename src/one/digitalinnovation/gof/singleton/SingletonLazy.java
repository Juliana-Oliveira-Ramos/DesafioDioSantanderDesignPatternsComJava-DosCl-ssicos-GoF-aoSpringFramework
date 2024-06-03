package one.digitalinnovation.gof.singleton;
/**
 * Singleton Preguiçoso
 * Autor : Venilton
 * */


public class SingletonLazy {
    //ccriar uma instancia dele mesmo
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }

        return instancia;

    }
}
