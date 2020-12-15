import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int start = n;
        
        for(int i = 0; i <= n; i++){
            for(int s = 0; s < start * 2; s++){
                System.out.print(" ");
            }
            for(int ele = i; ele >= 0; ele--){
                System.out.print(ele + " ");
            }
            for(int ele = 1; ele <= i; ele++){
                System.out.print(ele + " ");
            }
            System.out.println();
            start--;
        }
    }
}
