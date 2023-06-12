package Textbook;

public interface Operation {
    double opCriteria(double firstNum, double secondNum);

}
class CalculatorScenarioJosh{
    public static Double doOperation(double firstNum, double secondNum,Operation op){
        return op.opCriteria(firstNum, secondNum);
    }
    public static void main(String[] args) {
        Operation add=(x,y)->x+y;
        Operation minus=(x,y)->x-y;
        Operation multiply=(x,y)->x*y;
        Operation division=(x,y)->x/y;
        System.out.println(doOperation(12,4,multiply));

    }
}
