package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int sumOfSkipped=0, sumToPrint=0;
            for(int i=0;i<=lastInRow;i++){
                if(i<=numberToSkip){
                    sumOfSkipped+=i;
                    continue;
                }else{
                    sumToPrint+=i;
                    continue;
                }
            }

            System.out.println("skipped sum is "+sumOfSkipped);
            System.out.println("counted sum is "+sumToPrint);
        }


    }
}
