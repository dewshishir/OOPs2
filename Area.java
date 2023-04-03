import java.util.Scanner;

class Rect{
    int len;
    int ben;
    Rect(int l,int b){
        len =l;
        ben=b;
    }

    public int setArea() {
        return len*ben;
    }
    public void getArea(){
        System.out.println(setArea());
    }
}
public class Area {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
                int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Rect r = new Rect(a,b);
        r.getArea();
    }

}
