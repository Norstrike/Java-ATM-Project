public class Learning {
    public Object value=13;
    public Object assign="Saurabh";

    String newAssign= (String) assign + "singh";

    public static void main(String[] args) {
        Learning l=new Learning();
        System.out.println(l.value);
        System.out.println(l.assign);
        System.out.println(l.newAssign);
    }
}
