package TasksFromIgor.Lesson1;


// Создать класс в нём два поля Int и String. Создать объект этого класса в котором значение переменной Int =25 Strintg= "JAVA"

public class FealdDefine {

   // public FealdDefine(){

    //}
    public FealdDefine(int a, String b) {
        this.a = a;
        this.b = b;
    }

    int a;
    String b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
