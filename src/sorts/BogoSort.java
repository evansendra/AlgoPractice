package sorts;

import java.util.Arrays;

public class BogoSort {
    public static int[] sort(int[] A) {
        // shuffle the array
        int[] candidate;

        // is the array sorted?
        int counter = 0;
        do {
            ++counter;
            candidate = shuffle(A);
            System.out.println("Trying: " + Arrays.toString(candidate));
        } while ( !isSorted(candidate) );

        System.out.println("Took " + counter + " sorts!");
        return candidate;
    }

    private static boolean isSorted(int[] candidate) {
        for (int i = 0; i < candidate.length; ++i) {
            if (i != 0 && candidate[i] < candidate[i-1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] shuffle(int[] deck) {
        int N = deck.length;
        int[] shuffled = new int[N];
        int[] seen = new int[N];
        int numSeen = 0;

        for (int i = 0; i < N; ++i) {
            int pos = (int) (Math.random() * N);

            // make sure we haven't seen the index before
            boolean seenBefore;
            do {
                // assume we haven't seen this index before
                seenBefore = false;

                for (int j = 0; j < numSeen; ++j) {
                    if (seen[j] == pos) {
                        seenBefore = true;
                        pos = (int) (Math.random() * N);
                    }
                }
            } while (seenBefore);

            // since we haven't seen this presumably, add to deck
            shuffled[i] = deck[pos];
            seen[numSeen] = pos;
            numSeen++;
        }
        return shuffled;
    }
}
