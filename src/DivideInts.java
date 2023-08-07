public class DivideInts {
    //We're going to do integer division without using multiplication, division
    //or modulus while also not being able to store numbers larger than 32 bit. S
    //So we're going to subtract the divisor from the dividend until
    //the dividend is 0 or less than 0 and then return the total number of times subtracted
    //as the answer for the division.
    public int divide(int dividend, int divisor) {
        int total = 0;

        //If both dividend and divisor are negative then we want to subtract the negative divisor
        //which is essentially adding a positive integer to the negative dividend integer.
        if (dividend < 0 && divisor < 0) {
            while ((dividend - divisor) <= 0) {
                dividend = dividend - divisor;
                total++;
                if (total == Integer.MAX_VALUE) {
                    System.out.println("Total is: " + Integer.MAX_VALUE);
                    return Integer.MAX_VALUE;
                }
            }
            System.out.println("Total is: " + total);
            return total;
        }
        //If only the divisor is negative, then we want to add the negative which is the same as
        //just subtracting a positive integer.
        else if (divisor < 0) {
            while ((dividend + divisor) >= 0) {
                dividend = dividend + divisor;
                total++;
                if (total == Integer.MAX_VALUE && (dividend + divisor) >= 0){
                    return Integer.MIN_VALUE;
                }
                else if (total == Integer.MAX_VALUE) {
                    System.out.println("Total is: " + -total);
                    return -Integer.MAX_VALUE;
                }
            }
            System.out.println("Total is: " + total);
            return -total;
        }

        //If only the dividend is negative, then we want to add the negative which is the same as
        //just subtracting a positive integer.
        else if (dividend < 0) {
            while (dividend + divisor <= 0) {
                dividend = dividend + divisor;
                total++;
                if (total == Integer.MAX_VALUE && (dividend + divisor) <= 0){
                    System.out.println("Total is: " + Integer.MIN_VALUE);
                    return Integer.MIN_VALUE;
                }

                if (total == Integer.MAX_VALUE) {
                    System.out.println("Total is: " + -total);
                    return -Integer.MAX_VALUE;
                }
            }
            System.out.println("Total is: " + total);
            return -total;
        }

        //If they are both positive, then we will just subtract normally and return the total.
        else {
            while ((dividend - divisor) >= 0) {
                dividend = dividend - divisor;
                total++;
                if (total == Integer.MAX_VALUE) {
                    System.out.println("Total is: " + Integer.MAX_VALUE);
                    return Integer.MAX_VALUE;
                }
            }
            System.out.println("Total is: " + total);
            return total;
        }
    }
}
