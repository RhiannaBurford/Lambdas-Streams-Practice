public class P2 {
    public static void main (String[] args){


        ScoreCalculator add = (a, b) -> a + b;
        System.out.println(add.calculate(3, 4));

        int multiplier = 2;
        ScoreCalculator powerUp = (num1, num2) -> { if (num1> 100){
                                                        return (num1 + num2) * multiplier;
                                                    } 
                                                    return (num1 + num2);};

        System.out.println(powerUp.calculate(3, 290));

    }
}
