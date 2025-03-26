package learn.school.module_2.generics;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
class Animal {
    private final String name;
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

public class ConsumerExample {

    public static void addAllDogs(List<? super Dog> dogs, List<Dog> newDogs) {
        for (Dog dog : newDogs) {
            dogs.add(dog); // Мы можем безопасно добавить Dog, т.к. список гарантированно может хранить Dog или его суперклассы
        }
        // Problem:
//        Dog o = (Dog) dogs.get(0);
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        List<Dog> newDogs = new ArrayList<>();
        newDogs.add(new Dog("Fido"));
        newDogs.add(new Dog("Rex"));

        addAllDogs(animals, newDogs); // Работает, Animal – суперкласс Dog
        addAllDogs(objects, newDogs); //  Работает, Object – суперкласс Dog

        List<Animal> dogs = new ArrayList<>();
        addAllDogs(dogs, newDogs);
    }
}