package TasksFromIgor.HomeWork1;

public class FirstClass {

       public FirstClass(int a1, int b1, String c1){
this.a1=a1;
this.b1=b1;
this.c1=c1;
  }
        int a1,b1;
       String c1;

    public int getA() {
        return a1;
    }

    public String getC() {
        return c1;
    }

    public int getB() {
        return b1;
    }
    public void setC(String c) {
        this.c1 = c;
    }

    public void setB(int b) {
        this.b1 = b;
    }

    public void setA(int a) {
        this.a1 = a;
    }
}
