import java.util.Scanner;

class Student{
    String name;
    int num;
    String add;
}
public class Studentobj {
    public static void main(String args[]){
        Student sc1 =new Student();
        Student sc2 =new Student();
        Scanner s = new Scanner(System.in);
        sc1.name="Jhon";
        sc1.num=s.nextInt();
        sc1.add="pabna";
        sc2.name="sam";
        sc2.num=s.nextInt();
        sc2.add="netrokona";
        System.out.println(sc1.name);
        System.out.println(sc1.num);
        System.out.println(sc1.add);
        System.out.println(sc2.name);
        System.out.println(sc2.num);
        System.out.println(sc2.add);
    }
}
