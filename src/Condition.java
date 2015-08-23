
public class Condition {

    final double POWER_INIT = 300;

    String conditionName;
    Size conditionSize;
    int color;
    int spead;
    double power;

    public Condition(String conditionName, Size conditionSize, int color) {
        this.conditionName = conditionName;
        this.conditionSize = conditionSize;
        this.color = color;
    }

    /*   public Condition(String conditionName,Size conditionSize,int color){
            this.conditionName = conditionName;
            this.conditionSize = conditionSize;
            this.color = color;
        }

    */
    public void tornOn() {
        System.out.println("TurnOn кондиционер " + conditionName);
    }

    public void tornOff() {
        System.out.println("TurnOff Condition " + conditionName);
    }

    public void warm() {
        if(spead == 0) System.out.println("Please add speed!!!");
        else System.out.println("Warm air");
    }

    public void cool() {
        if(spead == 0) System.out.println("Please add speed!!!");
        else System.out.println("Cool air");
    }

    public void changeSpead(int speed){
        System.out.println("Change speed : " + speed);
        this.spead = speed;
        power = POWER_INIT * speed/2;
    }

    public String getName(){
        return conditionName;
    }

    public Size getSize(){
        return conditionSize;
    }

    public int getColor(){
        return color;
    }

    public double getPower(){
        return power;
    }
}
