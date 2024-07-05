import java.util.*;

public class PatternPyramids {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines ");
        int n=sc.nextInt();

        System.out.println("Pyramid");

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }

        System.out.println();

        System.out.println(" Inverted Pyramid");
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }System.out.println();
        }

        System.out.println();

        System.out.println(" Reverse Pyramid");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }System.out.println();
        }

        System.out.println();
        System.out.println("REverse Inverted Pyramids");

        for(int i=n;i>0;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }System.out.println();
        }

    }
}
