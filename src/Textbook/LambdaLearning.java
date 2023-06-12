package Textbook;

public class LambdaLearning {

    public double addCriteria(double firstNum,double secondNum){
        double result=firstNum+secondNum;
        return result;
    }
    public double minusCriteria(double firstNum,double secondNum){
        double result=firstNum-secondNum;
        return result;
    }
    public double multiplyCriteria(double firstNum,double secondNum){
        double result=firstNum*secondNum;
        return result;
    }
    public double divideCriteria(double firstNum,double secondNum){
        double result=firstNum/secondNum;
        return result;
    }
    public double doOperation(double num1,double num2,String operation){
        switch (operation){
            case "add":
                return addCriteria(num1,num2);
            case "minus":
                return minusCriteria(num1,num2);
            case "multiply":
                return multiplyCriteria(num1,num2);
            default:
                return divideCriteria(num1,num2);
        }
    }
    public static void main(String[] args) {
        LambdaLearning ll=new LambdaLearning();
        System.out.println(ll.doOperation(5,4,"multiply"));
    }
}
