/**
 *
 * @author Matt
 */
public class Timer {
    private ClockHand hundredthsOfASecond, seconds;
    
    public Timer() {
        hundredthsOfASecond = new ClockHand(100);
        seconds = new ClockHand(60);
    }
    
    public void advance() {
        hundredthsOfASecond.advance();
        
        if (hundredthsOfASecond.value() == 0) {
            seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + hundredthsOfASecond;
    }
    
    
}
