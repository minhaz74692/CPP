import java.util.Scanner;
public class NextRound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int k  = sc.nextInt();
        int result = 0;
        
        for(int i = 0; i < n ; i++){
            int score = sc.nextInt();
            if( score > k){
                result++;
            }
        }
        System.out.println(result);
    }
}
