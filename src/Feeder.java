public class Feeder{
    private FeedAnimalStrategy feedAnimalStrategy;

    public Feeder(FeedAnimalStrategy feedAnimalStrategy){
        this.feedAnimalStrategy = feedAnimalStrategy;
    }
    public void setFeedAnimalStrategy(FeedAnimalStrategy feedAnimalStrategy){
        this.feedAnimalStrategy = feedAnimalStrategy;
    }
    public void FeedAnimal(){
        feedAnimalStrategy.feed();
    }
// This is the context.
// The client picks a concrete strategy and passes it to
// the context.

// Usually the context accepts a strategy through the
// constructor, and also provides a setter so that the
// strategy can be switched at runtime.
}
