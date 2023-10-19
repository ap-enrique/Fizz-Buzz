public class FizzBuzz {

    public FizzBuzz() {
        game();
    }

    public void game() {
        for(int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
              System.out.println("Fizzbuzz");
            }
            
            else if (i % 3 == 0) {
              System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
              System.out.println("Buzz");
            }
        }
    }
}
