import java.util.*;

public class SmartTrafficNavigationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) graph.put(i, new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int source = sc.nextInt(), destination = sc.nextInt();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            if (current == destination) {
                System.out.println("YES");
                sc.close();
                return;
            }
            for (int next : graph.getOrDefault(current, Collections.emptyList())) {
                if (visited.add(next)) queue.add(next);
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
