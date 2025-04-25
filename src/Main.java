public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Bird mybird = new Bird();
        genericAnimal.makeSound();

        myDog.makeSound();

        myCat.makeSound();

        Animal animalRefDog = new Dog();
        animalRefDog.makeSound();

        mybird.makeSound();
        mybird.fly();

    }
}