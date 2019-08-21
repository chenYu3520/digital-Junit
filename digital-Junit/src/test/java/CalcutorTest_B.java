public class CalcutorTest_B {

    private int nbError = 0;

    public void testadd()
    {
        Calcutor calcutor = new Calcutor();

        double result = calcutor.add(20, 50);

        if (result != 60)
        {
//            System.out.println("Bad result: " + result);
            throw new IllegalStateException("Bad result: " +result);
        }
    }


    public static void main(String[] args) {
        CalcutorTest_B test = new CalcutorTest_B();

        try {
            test.testadd();
        } catch (Throwable e)
        {
            test.nbError++;
            e.printStackTrace();
        }

        if (test.nbError > 0)
        {
            throw new IllegalStateException("There were " + test.nbError + " error(s)");
        }
    }
}