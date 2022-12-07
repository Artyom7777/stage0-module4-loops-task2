package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main (String[] args){
        int multiplyByAndToInclusive = -5;
//    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive > 0){
            int i = 0;
            int sum = 0;
            while(i <= multiplyByAndToInclusive){
                sum = i * multiplyByAndToInclusive;
                System.out.println(sum);
                i++;
            }
        }
        if (multiplyByAndToInclusive < 0){
            int f = 0;
            int i = 0;
            int sum = 0;
            while(f >= multiplyByAndToInclusive){
                sum = i * multiplyByAndToInclusive;
                System.out.println(sum);
                i++;
                f--;
            }

        }
    }
}
