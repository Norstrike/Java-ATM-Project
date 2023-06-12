package ExceptionLearning;
class NavinException extends Exception {
    public NavinException(String value){
        super(value);
    }
}
public class TeluskoLearning {
    public static void main(String[] args) {
        int i=12;
        int j=0;
        try{
            j=10/i;
            if (j==0){
                throw new NavinException("Value cant be zero");
            }
        }catch (NavinException e){
            System.out.println(e.getMessage());
        }

    }
}
