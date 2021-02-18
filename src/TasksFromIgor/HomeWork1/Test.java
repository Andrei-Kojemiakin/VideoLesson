package TasksFromIgor.HomeWork1;

public class Test {


    public static void main(String[] args) {

        FirstClass objectFC_1 = new FirstClass(12,14,"Vood");
        FirstClass objectFC_2 = new FirstClass(17,25,"Tree");
        SecondClass objectSC_1 = new SecondClass(12,78);

        System.out.println(objectFC_1.getA());
        System.out.println(objectFC_1.getB());
        System.out.println(objectFC_1.getC());

        System.out.println(objectFC_2.getA());
        System.out.println(objectFC_2.getB());
        System.out.println(objectFC_2.getC());

        System.out.println(objectSC_1.getD());
        System.out.println(objectSC_1.getE());
    }


}
