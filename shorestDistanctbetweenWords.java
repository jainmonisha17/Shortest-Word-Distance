import java.util.*;

public class shorestDistanctbetweenWords {

    public int shortestDistance(String[] words, String word1, String word2) {
        int shortestDistance = words.length;
        int position1 = -1;
        int position2 = -1;

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.equals(word1)) {
                position1 = i;
            } else if(word.equals(word2)) {
                position2 = i;
            }

            //if both the positions are updated, update the shortest distance
            if(position1 != -1 && position2 != -1) {
                shortestDistance = Math.min(shortestDistance, Math.abs(position1 - position2));
            }
        }
        return shortestDistance;
    }

    public static void main(String[] args) {
        shorestDistanctbetweenWords solution = new shorestDistanctbetweenWords();
        
         // Test case 1
        String[] words1 = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        String word11 = "fox";
        String word21 = "dog";
        int expectedOutput1 = 5;

        int actualOutput = solution.shortestDistance(words1, word11, word21);
        System.out.println("Test case 1: " + (expectedOutput1 == actualOutput));

         // Test case 2
        String[] words2 = { "a", "b", "c", "d", "a", "b" };
        String word12 = "a";
        String word22 = "b";
        int expectedOutput2 = 1;
        int actualOutput2 = solution.shortestDistance(words2, word12, word22);
        System.out.println(expectedOutput2 = 1);
        System.out.println("Test case 2: " + (expectedOutput2 == actualOutput2));

        // Test case 3
        String[] words3 = { "a", "c", "d", "b", "a" };
        String word13 = "a";
        String word23 = "b";
        int expectedOutput3 = 1;
        System.out.println(expectedOutput2 = 3);
        int actualOutput3 = solution.shortestDistance(words3, word13, word23);
        System.out.println("Test case 3: " + (expectedOutput3 == actualOutput3));

        // Test case 4
        String[] words4 = { "a", "b", "c", "d", "e" };
        String word14 = "a";
        String word24 = "e";
        int expectedOutput4 = 4;
        System.out.println(expectedOutput2 = 4);
        int actualOutput4 = solution.shortestDistance(words4, word14, word24);
        System.out.println("Test case 4: " + (expectedOutput4 == actualOutput4));
    }
}


// TC -> O(n), where n is the length of the words list. This is because the algorithm loops through the words list only once
// SC _> O(1)