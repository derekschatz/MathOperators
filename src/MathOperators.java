public class MathOperators {

    public static void main(String[] args) {
        int val1 = 21;
        int val2 = 6;
        int val3 = 3;
        int val4 = 1;


        int result1 = val1 - val2 / val3;
        int result2 = (val1 - val2) / val3;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = val3 - ((val1 / val3) - val4);

        System.out.println(result3);



    }
}
