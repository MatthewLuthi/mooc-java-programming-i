/**
 *
 * @author Matt
 */
public class Container {
    private int amount;
    
    public Container() {
        amount = 0;
    }
    
    public int contains() {
        return amount;
    }
    
    /**
     * Add the parameter amount to the container. The
     * container must not hold over 100 units of liquid.
     * @param amount 
     */
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            
            if (this.amount > 100) {
                this.amount = 100;
            }
        }
    }
    
    public void move(int amount, Container other) {
        if (amount > this.amount) {
            amount = this.amount;
        }
        
        this.remove(amount);
        other.add(amount);
    }
    
    /**
     * Remove the amount of liquid specified in the parameter.
     * @param amount to be removed from this container.
     */
    public void remove(int amount) {
        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    /**
     * Visual representation of the container object like x / 100
     * @return the string representation
     */
    @Override
    public String toString() {
        return amount + "/100";
    }
}
