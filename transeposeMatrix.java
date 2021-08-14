import java.util.Scanner;

public class transeposeMatrix {

    public static void main(String[] args) {
        char ans;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Number of Row : ");
            int p = scanner.nextInt();
            System.out.print("Enter the Number of Column : ");
            int q = scanner.nextInt();
            int[][] arr = new int[p][q];
            System.out.println("Enter the element in Matrix : ");
            for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<q ; j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.println("The Matrix is");
            for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<q ; j++){
                    System.out.print(arr[i][j]+" ");
                }System.out.println("");
            }
            int rowtemp = q ;
            int coltemp = p ;
            System.out.println("The Transpose Matrix ");
            for(int i=0 ; i<rowtemp; i++){
                for(int j=0 ; j<coltemp ; j++){
                    System.out.print(arr[j][i]+" ");
                }System.out.println("");
            }System.out.print("Do You Run Again (y/n) : ");
            ans = scanner.next().charAt(0);
        }while((ans == 'y') || (ans == 'Y'));
        System.out.println("Thank you !!!");
    }
}
