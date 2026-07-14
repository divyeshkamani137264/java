public class OddEven {
    public static void main(String[] args) {

        int number = Integer.valueOf(args[0]);

        if (number % 2 != 0) {
            System.out.println("The given number " + number + " is ODD.");
        } else {
            System.out.println("The given number " + number + " is EVEN.");
        }
    }
}
