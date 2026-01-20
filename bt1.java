package lec_06;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So phan tu cua mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu trong mang: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        for (int i = n - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println("Cac so chan trong mang: ");
        for (int i = 0; i < n; i++){
            if (a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (a[i] % 3 == 0 && a[i] % 5 == 0){
                sum += a[i];
            }
        }
        for (int i = 0; i < n -1; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
           }
       }
       System.out.println("Mang sau khi sap xep giam dan: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
