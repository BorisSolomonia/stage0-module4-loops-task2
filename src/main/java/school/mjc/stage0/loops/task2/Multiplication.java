package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
       int n = 0;
       int k = multiplyByAndToInclusive;
       int z = 0;
       while (z < multiplyByAndToInclusive+1){
            n += k; ;
            z++;
            System.out.println(n);
       }
    }
}
