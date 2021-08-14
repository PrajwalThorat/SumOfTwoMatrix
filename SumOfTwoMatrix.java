import java.util.Scanner;
public class SumOfTwoMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row of first matrix : ");
        int p = scanner.nextInt();
        System.out.print("Enter the column of first matrix : ");
        int q = scanner.nextInt();
        System.out.print("Enter the row of secound matrix : ");
        int m = scanner.nextInt();
        System.out.print("Enter the row of secound matrix : ");
        int n = scanner.nextInt();
        if(p==m && q==n){
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
            System.out.println("Enter the all element of First Matrix ");
            for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<q ; j++){
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Enter the all element of Second Matrix ");
            for(int i=0; i<m ; i++){
                for(int j=0 ; j<n ; j++){
                    b[i][j] = scanner.nextInt();
                }
            }
            System.out.println("First Matrix ");
            for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<q ; j++){
                    System.out.print(a[i][j]+" ");
                }System.out.println("");
            }
            System.out.println("Second Matrix ");
            for(int i=0 ; i<m ; i++){
                for(int j=0 ; j<n ; j++){
                    System.out.print(b[i][j]+" ");
                }System.out.println("");
            }
            for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<n ; j++){
                    for(int k=0 ; k<q ; k++){
                        c[i][j] = a[i][j]+b[i][j];
                    }
                }
            }
            System.out.println("Addition Of Matrix ");
            for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<n ; j++){
                    System.out.print(c[i][j]+" ");
                }System.out.println("");
            }
        }else{
            System.out.println("Addition would not be possible !!");
        }

    }
    
}
