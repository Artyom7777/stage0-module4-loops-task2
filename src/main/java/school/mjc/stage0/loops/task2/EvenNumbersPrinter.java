package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        if (printTillInclusive % 2 == 0) {
            int var = 0;
            while (var == printTillInclusive) {
                System.out.println(var);
                var++;
            }
        }
    }
}
