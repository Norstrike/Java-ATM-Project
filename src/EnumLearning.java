public class EnumLearning {
    public enum Color{
        RED,
        GREEN,
        BLUE
    }

    public static void main(String[] args) {
        Color myColor = Color.GREEN;
        switch (myColor){
            case RED -> {
                System.out.println("selected color is RED");
                break;
            }
            case BLUE -> {
                System.out.println("selected color is BLUE");
                break;
            }
            case GREEN -> {
                System.out.println("selected color is GREEN");
                break;
            }
        }
    }
}
