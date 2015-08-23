public class Main {

    public static void main(String[] args) {
        Size sizeObj = new Size(200, 100, 50);
        Condition conditionObj = new Condition("Samsung", sizeObj, 002200);

        conditionObj.tornOn();

        conditionObj.cool();

        conditionObj.changeSpead(10);

        conditionObj.cool();

        double power = conditionObj.getPower();
        System.out.println("Condition power : " + power);

        conditionObj.tornOff();
    }

}
