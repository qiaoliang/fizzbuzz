public class FizzBuzz {


    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String say(int counting) {
        String result="";
        if(isFizz(counting))
            result+= FIZZ;
        if(isBuzz(counting))
            result+= BUZZ;
        return result==""? String.valueOf(counting):result;
    }

    private boolean isBuzz(int counting) {
        return isDividedOrContained(counting, 5);
    }
    private boolean isFizz(int counting) {
        return isDividedOrContained(counting, 3);
    }

    private boolean isDividedOrContained(int counting, int dividBy) {
        return counting % dividBy == 0 || String.valueOf(counting).contains(String.valueOf(dividBy));
    }

}