
/**
 *
 * @author PaniJC
 */
package strategymethod;

public class StrategyMethod {

    public static void main(String[] args) {
        Viking viking = new Viking(new Fly());
        System.out.println("La cantidad de posiciones que debe mover en modo Fly es de: " + viking.move());
        
        viking = new Viking(new Walk());
        System.out.println("La cantidad de posiciones que debe mover en modo Walk es de: " +  viking.move());
      
    }
    
}
