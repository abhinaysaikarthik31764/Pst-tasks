import java.util.*;

public class HashtagFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.nextLine().trim();
            counts.put(hashtag, counts.getOrDefault(hashtag, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.close();
    }
}
