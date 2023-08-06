public class DivideIntsMain {

    public static void main(String[] args){
        DivideInts di = new DivideInts();

        di.divide(9,3);
        di.divide(-60,5);
        di.divide(49, -3);
        di.divide(-49, -3);
        //di.divide(Integer.MAX_VALUE, 1);
        //di.divide(Integer.MIN_VALUE, 1);
        //di.divide(Integer.MIN_VALUE, -1);
        //di.divide(Integer.MAX_VALUE, -1);
        di.divide(Integer.MAX_VALUE, 1);
        di.divide(Integer.MAX_VALUE, -1);
        di.divide(-2147483648, -1);
        di.divide(-2147483648, 1);
    }
}
