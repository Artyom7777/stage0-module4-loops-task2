package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
            int var = 0;
            while (var <= printTillInclusive) {
                if(var % 2 == 0) {
                    System.out.println(var);
                }
                var++;
            }
        }
    }

