import java.util.Objects;

public class ObjectLearning {
    public String model;
    public int price;

    public String toString(){
        return model+" : "+price;
    }

  /*  public boolean equals(ObjectLearning that){
    return this.model.equals(that.model) && this.price==that.price;
    }

   */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectLearning that = (ObjectLearning) o;
        return price == that.price && model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public static void main(String[] args) {
        ObjectLearning obj1=new ObjectLearning();
        obj1.model="Lenovo yoga";
        obj1.price=1000;
        ObjectLearning obj2=new ObjectLearning();
        obj2.model="Lenovo yoga";
        obj2.price=1000;
        System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));
    }
}
