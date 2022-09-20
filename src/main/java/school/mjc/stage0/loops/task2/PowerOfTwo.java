package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int n = 1;
        while (n < power+1){
            System.out.println(Math.pow(2,n));
            n++;
        }
    }
}
