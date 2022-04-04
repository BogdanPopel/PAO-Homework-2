public class AnimalFactory {
    public Animal createAnimal(String animalName){
        if(animalName.isEmpty() || animalName == null) return null;
        switch (animalName){
            case "cat": return new Cat();
            case "dog": return new Dog();
            case "parrot": return new Parrot();
            default: throw new IllegalArgumentException("Animal name must be in lowercase. Options: cat, dog, parrot.\n");
        }
    }
}
