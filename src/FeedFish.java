public class FeedFish implements FeedAnimalStrategy{
    @Override
    public void feed() {
        System.out.println("Fed with fish");
    }
}
//Concrete Strategy