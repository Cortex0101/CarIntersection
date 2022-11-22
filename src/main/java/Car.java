public class Car implements Runnable {
  public String name;
  public SingleLane singleLane;

  public Car(SingleLane singleLane) {
    this.singleLane = singleLane;
  }

  @Override
  public void run() {
    singleLane.crossingBridge(this);
  }
}