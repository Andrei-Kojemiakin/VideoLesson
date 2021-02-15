package HomeWork.Lesson5;

public class BancAccount1 {
    int id;
    double balance;
    double popolnit;
    double sniat;
    double p;
    double s;


   double popolnenieSheta (double popolnit) {
       balance+=popolnit;
       return balance;
   }
   double snianieSoSheta (double sniat) {
       balance-=sniat;
       return balance;
   }

   void showInfo() {
       System.out.println(" Номер счёта- " + id + " Баланс- " + balance + " Сумма зачисления- " + p + " Сумма снятия- " + s);
   }
   void showInfo1() {
   System.out.println( " Номер счёта- "+id+" Баланс- "+balance+" Сумма зачисления- "+p) ;
       }

}

class TestBA{
    public static void main(String[] args) {
        BancAccount1 BA1 =new BancAccount1();
        BA1.id=12;
        BA1.balance=201.5;

        BA1.showInfo();
        BA1.popolnenieSheta(51.2);
        BA1.showInfo1();
        BA1.snianieSoSheta(20.5);
        BA1.showInfo();
    }
}

class TestBA1{
    public static void main(String[] args) {
        BancAccount1 BA2 =new BancAccount1();
        BA2.id=13;
        BA2.balance=10.5;

        BA2.showInfo();
        BA2.popolnenieSheta(5.2);
        BA2.showInfo();
        BA2.snianieSoSheta(10.5);
        BA2.showInfo();
    }
}