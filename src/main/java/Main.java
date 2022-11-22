public class Main {

  public static void main(String[] args) {
    final SingleLane singleLane = new SingleLane();
    int numberofCarsfromEast = 4;
    int numberofCarsfromWest = 4;


    Thread West = new Thread(new Runnable() {
      @Override
      public void run() {
        int carCount = 0;
        while (true) {
          if (carCount >= numberofCarsfromWest) {
            break;
          }
          Car car = new Car(singleLane);
          Thread mt1 = new Thread(car);
          car.name = "(West) Car " + mt1.getId();
          mt1.start();
          carCount++;
        }
      }
    });


    Thread East = new Thread(new Runnable() {
      @Override
      public void run() {
        int carCount = 0;
        while (true) {
          if (carCount >= numberofCarsfromEast) {
            break;
          }
          Car car = new Car(singleLane);
          Thread mt1 = new Thread(car);
          car.name = "(East) Car  " + mt1.getId();
          mt1.start();
          carCount++;
        }
      }
    });

    West.start();
    East.start();
  }
}