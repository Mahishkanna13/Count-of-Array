import java.util.Scanner;

public class Count {
    public static int CountNumbers(int [] Array)
    {
        int max=Integer.MIN_VALUE;
        int counter=0;
        for(int i=0;i<Array.length;i++)
        {
            if(Array[i]>max)
            {
                max=Array[i];
            }
        }
        for(int i=0;i<Array.length;i++)
        {
            if(Array[i]==max)
            {
                counter++;
            }
        }

        return Array.length-counter;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int length=scan.nextInt();
        int [] Array=new int[length];
        System.out.println("Enter the Elements :");
        for(int i=0 ; i<length ; i++)
        {
            Array[i]=scan.nextInt();
        }
        System.out.println("The count is :"+CountNumbers(Array));
    }
}
