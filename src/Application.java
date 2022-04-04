import java.util.Objects;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Scanner scan = new Scanner(System.in);
        System.out.println("Factory Method:");
        System.out.println("Create an animal. The available options are:\ncat\ndog\nparrot.\nexit");
        String option = scan.nextLine();
        while (!option.equals("exit"))
        {
            Animal animal = animalFactory.createAnimal(option);
            animal.whatAnimal();
            option = scan.nextLine();
        }


        System.out.println("Strategy Method:");
        System.out.println("Choose what to feed the Animals with. Options are:\n1 -> beef\n2 -> fish\n3 -> seeds");
        System.out.println("Type 'exit' to leave.");
        option = "";
        FeedAnimalStrategy feedStrategy = new FeedBeef();
        Feeder feeder = new Feeder(feedStrategy);

        while(!option.equals("exit"))
        {
            option = scan.nextLine();

            switch (option){
                case "1":
                    feedStrategy = new FeedBeef();
                    feeder.setFeedAnimalStrategy(feedStrategy);
                    feeder.FeedAnimal();
                    break;
                case "2":
                    feedStrategy = new FeedFish();
                    feeder.setFeedAnimalStrategy(feedStrategy);
                    feeder.FeedAnimal();
                    break;
                case "3":
                    feedStrategy = new FeedSeeds();
                    feeder.setFeedAnimalStrategy(feedStrategy);
                    feeder.FeedAnimal();
                    break;
                case "exit":
                    System.out.println("Thank You!");
                    break;
                default: System.out.println("Invalid choice");
            }
        }

    }


}
