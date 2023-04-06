import java.util.*;
public class Arr2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int marks[] =new int[sub];
        for (int i=0;i<sub;i++)
            marks[i]= sc.nextInt();
        for (int i=0;i<sub;i++)
            System.out.println(marks[i]);

    }
}
