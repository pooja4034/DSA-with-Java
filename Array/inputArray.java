import java.util.*;
public class inputArray{
    public static void main(String args[])
    {
        int marks[] = new int[10];

     Scanner sc = new Scanner(System.in);

     marks[0]=sc.nextInt();
     marks[1]=sc.nextInt();

     System.out.println(marks[0]);
     System.out.println(marks[1]);

     //update marks
     marks[1]=100;
     System.out.println(marks[1]);

    }

}