import java.util.*;
import java.util.stream.Collectors;

public class SalaryTransformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        List<Integer> updated = salaries.stream()
                .map(salary -> (int) (salary * 1.10))
                .collect(Collectors.toList());

        for (int salary : updated) {
            System.out.print(salary + " ");
        }
        System.out.println();
        sc.close();
    }
}
