package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int n = 1;
        int k = 1;
        while (n < printToInclusive+1){
            k = n*k;
            System.out.println(k);
            n++;
        }
    }
}
