import java.util.*;

class Asset {
    String name;
    double returnRate;
    double volatility;

    Asset(String n, double r, double v)
    {
        name = n;
        returnRate = r;
        volatility = v;
    }

    public String toString() {
        return name + ":" + returnRate;
    }
}

public class Question4 {

    public static void main(String[] args) {
        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12, 5));
        list.add(new Asset("TSLA", 8, 7));
        list.add(new Asset("GOOG", 15, 4));

        // Merge Sort using Collections (stable)
        list.sort(Comparator.comparingDouble(a -> a.returnRate));
        System.out.println("Merge: " + list);

        // Quick-like sort (desc + volatility)
        list.sort((a, b) -> {
            if (b.returnRate != a.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            return Double.compare(a.volatility, b.volatility);
        });

        System.out.println("Quick Desc: " + list);
    }
}