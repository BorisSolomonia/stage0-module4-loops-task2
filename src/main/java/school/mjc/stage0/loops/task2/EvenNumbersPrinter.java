package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int k = 0;
        while (k < printTillInclusive-2){
            k = k+2;
            System.out.println(k);
        }
    }
}
