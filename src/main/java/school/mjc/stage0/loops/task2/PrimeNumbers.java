package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 0;
        while (n < printToInclusive+1){
            if(n%2 !=0 && n%3 != 0 && n%7 != 0){
                System.out.println(n);
            } else if(n == 3 || n == 7){
                System.out.println(n);
            }
            n++;
        }
    }
}
