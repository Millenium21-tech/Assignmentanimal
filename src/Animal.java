

// Superclass: Animal
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound.");
    }
}


// Subclass: Dog
class Dog extends Animal {
    @Override
// Indicates we are overriding the makeSound() method
    public void makeSound() {
        System.out.println("The Dog says:Woof!");
// Dog-specific sound
    }
}


// Subclass: Cat
class Cat extends Animal {
    @Override
// Indicates we are overriding the makeSound() method
    public void makeSound() {
        System.out.println(" The Cat says:Meow!");
// Cat-specific sound
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Bird says: chirps!");
    }

    public void fly() {
        System.out.println("Flying!");
    }
}



