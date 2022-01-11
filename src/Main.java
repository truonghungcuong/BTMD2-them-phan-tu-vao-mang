import java.util.Scanner;

public class Main {
    public static double[] insertValueToArray(double[] array, double value, int position) {
        double[] newArray = new double[array.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = value;
        for (int i = position + 1; i < array.length + 1; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array;
        int size;
        do {
            System.out.print("Nhap so luong phan tu cua mang:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhap so luong phan tu nho hon 20");
            }
        } while (size > 20);
        array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la:" + array[i]);
        }
        double value;
        int position;
        System.out.println("Nhap gia tri phan tu muon chen:");
        value = sc.nextDouble();
        System.out.println("Nhap vi tri phan tu muon chen:");
        position = sc.nextInt();
        if (position < 0 || position >= array.length) {
            System.out.println("Khong chen duoc");
        } else {
            double[] newArray = insertValueToArray(array, value, position);
            for (int i = 0; i < size + 1; i++) {
                System.out.println("Phan tu thu " + (i + 1) + " la:" + newArray[i]);
            }
        }
    }
}