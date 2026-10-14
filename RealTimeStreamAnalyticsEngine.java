import java.util.*;
import java.util.stream.Collectors;

public class RealTimeStreamAnalyticsEngine {
    static class SensorReading {
        String sensorId;
        double temperature;

        SensorReading(String sensorId, double temperature) {
            this.sensorId = sensorId;
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SensorReading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            readings.add(new SensorReading(sc.next(), sc.nextDouble()));
        }

        Map<String, Double> averages = readings.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingDouble(r -> r.temperature)));

        averages.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s %.1f%n", e.getKey(), e.getValue()));

        sc.close();
    }
}
