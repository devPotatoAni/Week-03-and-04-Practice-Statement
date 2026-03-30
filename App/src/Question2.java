import java.util.*;

class Client {
    String name;
    int riskScore;
    int balance;

    Client(String n, int r, int b) {
        name = n;
        riskScore = r;
        balance = b;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Question2 {

    static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 &&
                    (arr[j].riskScore < key.riskScore ||
                            (arr[j].riskScore == key.riskScore &&
                                    arr[j].balance < key.balance))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("C", 80, 1000),
                new Client("A", 20, 500),
                new Client("B", 50, 700)
        };

        bubbleSort(arr);
        System.out.println("Ascending:");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("Descending:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Top Risks:");
        for (int i = 0; i < Math.min(3, arr.length); i++) {
            System.out.println(arr[i]);
        }
    }
}