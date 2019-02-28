import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

    	// **** create hash map with first string ****
    	HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
    	for (int i = 0; i < s1.length(); i++)
    	{
    		char ch = s1.charAt(i);
    		if (!hm1.containsKey(ch)) {
    			hm1.put(ch, 1);
    		}
    	}
    	
    	// **** create hash map with second string ****
       	HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
    	for (int i = 0; i < s2.length(); i++)
    	{
    		char ch = s2.charAt(i);
    		if (!hm2.containsKey(ch)) {
    			hm2.put(ch, 1);
    		}
    	}

    	// **** traverse first hash map looking character match in second one ****
    	for (Character ch : hm1.keySet()) {
    		if (hm2.containsKey(ch))
    			return "YES";
    	}

    	// **** ****
    	return "NO";
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
