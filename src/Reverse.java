import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size cannot be greater than 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
            arr[i] = sc.nextInt();
            i++;
        }
        //In ra mang
        System.out.printf("%-20s%s","Cac phan tu trong mang: ","");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }
        //Dao nguoc mang
        for(int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size-j-1];
            arr[size-j-1] = temp;
        }
        //In ra mang sau khi dao nguoc
        System.out.printf("\n%-20s%s","Mang sau khi dao nguoc: ","");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }
    }
}
