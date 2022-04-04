public class FeedBeef implements FeedAnimalStrategy{
    @Override
    public void feed() {
        System.out.println("Fed with beef");
    }
}
//Concrete Strategy