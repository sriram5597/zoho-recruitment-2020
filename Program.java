import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void display(ArrayList<Integer> arr, int start){
        for(int i = 0; i < start * 2; i++){
            System.out.print(" ");
        }
        for(int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        int start = n;
        for(int i = 0; i <= n; i++){
            if(i > 0){
                arr.add(i);
                arr.add(0, i);
            }
            else{
                arr.add(i);
            }
            display(arr, start);
            start--;
        }
    }
}
