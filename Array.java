import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter the elements of the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sort(a);
        System.out.println("The sorted array is");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int key = 50;
        int index = search(a, key);
        if (index != -1) {
            System.out.println(key + " is present at index " + index);
        } else {
            System.out.println(key + " is not present in the array");
        }
    }

    static void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static int search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
