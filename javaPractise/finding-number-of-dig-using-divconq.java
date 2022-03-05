// this algorithm is 20 times more efficient way of finding number of digits in a number than the method version -  
//int length = String.valueOf(number).length(); or the logarithmic approach.
// using divide and conquer way we can find easily with efficient way and less costlier operation.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int digits = digFinder(num);
        System.out.println(digits);
        scanner.close();
    }

    static int digFinder(long num){

        if (num < 100_000) {
            if (num < 100) {
                if (num < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (num < 1000) {
                    return 3;
                } else {
                    if (num < 10_000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (num < 10_000_000) {
                if (num < 1_000_000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (num < 100_000_000) {
                    return 8;
                } else {
                    if (num < 1_000_000_000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }
}

// the other way of doing this is by taking the advantage of the fact that any number can be represented by the 
// addition of powers of 2. For example, 15 can be represented as 8+4+2+1, which are all powers of 2.

/* int length = 1;
if (number >= 100000000) {
    length += 8;
    number /= 100000000;
}
if (number >= 10000) {
    length += 4;
    number /= 10000;
}
if (number >= 100) {
    length += 2;
    number /= 100;
}
if (number >= 10) {
    length += 1;
}
return length; */
