import java.util.*;
public class ArrSc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int marks[] =new int[sub];
        for (int i=0;i<sub;i++)
            marks[i]= sc.nextInt();
        int c= sc.nextInt();
        for (int i=0;i<sub;i++) {
         if(marks[i]==c)
            System.out.println("c found at index "+i);
        }
    }
}
