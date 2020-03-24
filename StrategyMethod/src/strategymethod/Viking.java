
/**
 *
 * @author PaniJC
 */
package strategymethod;

public class Viking {
    
   private int position;
   private StrategyInt moveBehavior;
    
    public Viking(StrategyInt strategy){
        this.moveBehavior = strategy;
    }
    
    public int move(){
       return moveBehavior.move(new Fly()); 
    }
    
    
}
