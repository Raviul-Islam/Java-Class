import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        String[5] a={"A","B","C","D","E"};
        String[3] b;

        System.out.println("Elements of a are: ");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter elements of b: ");
        for(j=0;j<3;j++)
        {
            Scanner obj=new Scanner(System.in);
            b[j]=obj.nextString();
        }
        System.out.println("Elements of b are: ");
        
    }
}
