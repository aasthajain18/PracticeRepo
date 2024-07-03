import java.util.Scanner;

public class  PatternButterfly{
    public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        
        for(int i=n-1;i>=0;i--){
            
            for(int j=0;j<n-i;j++){
                    System.out.print("*");
            }

            for(int k=0;k<2*i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            
            for(int j=n;j>i;j--){
                    System.out.print("*");
            }

            for(int k=0;k<2*i;k++){
                System.out.print(" ");
            }

            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
