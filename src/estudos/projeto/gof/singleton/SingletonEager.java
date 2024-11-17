package estudos.projeto.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author JoaoGabrielFa
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();;
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
