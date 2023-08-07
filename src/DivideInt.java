public class DivideInt {

    public int divide(int dividend, int divisor) {

        //Extreme Cases to save run time.
        if (dividend == Integer.MAX_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return -Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (dividend == divisor) {
            return 1;
        }
        if(-dividend == divisor || dividend == -divisor) {
            return -1;
        }

        //Convert everything to negative to make it easier to manipulate, just make sure
        //to change the results accordingly depending on how many negatives there were.
        if (dividend > 0 && divisor > 0) {
            return divisionMethod(-dividend, -divisor);
        } else if (dividend > 0) {
            return -divisionMethod(-dividend, divisor);
        } else if (divisor > 0) {
            return -divisionMethod(dividend, -divisor);
        } else {
            return divisionMethod(dividend, divisor);
        }
    }

    //Method that is taking in 2 negative numbers which are our dividend and divisor.
    //We subtract the divisor (which is negative) while the result is less than or equal to 0.
    public int divisionMethod(int dividend, int divisor){
        int total = 0;
        while(dividend - divisor <= 0){
            dividend = dividend - divisor;
            total++;
        }
        return total;
    }
}
