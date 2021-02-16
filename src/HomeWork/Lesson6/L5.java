package HomeWork.Lesson6;

public class L5 {


    int metod () {
        return 0;
    }
    int metod (int a1){
        return a1;
            }
    int metod (int a2,int b2) {
        return a2 + b2;
    }
    int metod (int a3,int b3, int c3){
        return a3 + b3+c3;

    }
    int metod (int a4,int b4, int c4, int d4) {
        return a4 + b4 + c4 + d4;


    }
}
class L5Test{

    public static void main(String[] args) {
        L5 L51=new L5();
        int q = L51.metod();
        System.out.println(q);
        int x = L51.metod(5);
        System.out.println(x);
        int y = L51.metod(2,5);
        System.out.println(y);
        int z = L51.metod(7,6,4);
        System.out.println(z);
        int w = L51.metod(8,45,75,36);
        System.out.println(w);

    }







}
