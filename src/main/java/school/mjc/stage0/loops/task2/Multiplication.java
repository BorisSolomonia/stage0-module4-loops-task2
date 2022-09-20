package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n = 1;
        int k = 1;
        while (k < multiplyByAndToInclusive+1){
            n = n*(k+1);
            k++;
            System.out.println(k);
            System.out.println(n);
        }
    }
}
