//Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.

package two;

public class PerformanceTest_sb {

	public static void main(String[] args) {
		int iterations = 10000;
        String toAppend = "AIET";

        // Measure performance of StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(toAppend);
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;

        // Measure performance of StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(toAppend);
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer for single-threaded operations.");
        } else {
            System.out.println("StringBuffer is faster (rare), but usually StringBuilder is preferred for performance.");
        }

	}

}
