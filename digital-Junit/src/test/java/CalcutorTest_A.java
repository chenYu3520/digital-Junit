public class CalcutorTest_A {

    public static void main(String[] args) {

        Calcutor calcutor = new Calcutor();

        double result = calcutor.add(2147483647, 30);

        if (result != 2147483647)
        {
            throw new IllegalStateException("Bad result: " +result);
//            System.out.println("The error result is :" + result);
        }
    }
}