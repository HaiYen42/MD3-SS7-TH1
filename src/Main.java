import animals.Animals;
import animals.Chicken;
import animals.Tiger;
import com.sun.org.apache.xpath.internal.operations.Or;
import edible.IEdiable;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {
    public static void main(String[] args) {

        Animals[] animals= new Animals[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) { //Kiểm tra xem animal có pải là Chicken ko? Đối tượng có phù hợp với class đang so sánh ko ?
                IEdiable ediable= (Chicken) animal;
                System.out.println(ediable.howToEat());
            }
        }
        Fruit [] fruits= new Fruit[2];
        fruits[0]= new Orange();
        fruits[1] = new Apple();

        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
            if (fruit instanceof Orange) { //Kiểm tra xem animal có pải là Chicken ko? Đối tượng có phù hợp với class đang so sánh ko ?
                IEdiable ediable= (Orange) fruit;
                System.out.println(ediable.howToEat());
            }
            }

        }
    }
