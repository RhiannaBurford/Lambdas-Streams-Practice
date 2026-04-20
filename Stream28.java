public class Stream28 {
    public static void main(String[] args){
        /* Find the Sum of Digits of a Number */

        int number = 12345;
        int sum = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Sum of Digits: " + sum);
    }
}
