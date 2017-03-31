import java.util.ArrayList;
import java.util.List;

/**
 * Created by Игорь on 29.03.2017.
 */
public class Main {
    public static void main (String[] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Horse());
        animals.add(new Monkeys());
        animals.add(new Horse());
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}








