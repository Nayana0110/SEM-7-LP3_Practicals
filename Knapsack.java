import java.util.Arrays;
import java.util.Comparator;
class Item {
    double weight, value, ratio;
    Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight;
    }
}
public class Knapsack {
    public static double getMaxValue(Item[] items, double capacity) {
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio);
            }
        });
        double totalValue = 0; 
        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * (capacity / item.weight);
                break; 
            }
        }
        return totalValue; 
    }
    public static void main(String[] args) {
        Item[] items = { 
            new Item(10, 60), 
            new Item(20, 100), 
            new Item(30, 120) 
        };
        double capacity = 50; 
        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}
