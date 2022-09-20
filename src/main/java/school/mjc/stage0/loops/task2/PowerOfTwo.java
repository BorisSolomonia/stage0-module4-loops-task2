package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int n = 1;
        if(power < 0){
            System.out.println("too much power");
        }else {
            while (n < power+1){
                System.out.println(Integer.valueOf((int) Math.pow(2,n)));
                n++;
            }
        }
    }
}
