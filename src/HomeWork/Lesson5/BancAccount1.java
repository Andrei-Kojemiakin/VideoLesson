package HomeWork.Lesson5;

public class BancAccount1 {
    int id;
    double balance;
    double popolnit;
    double sniat;

   double popolnenieSheta (double popolnit) {
       balance+=popolnit;
       return balance;
   }
   double snianieSoSheta (double bacs) {
       balance-=bacs;
       return balance;
   }

   void showInfo() {
   System.out.println( " Номер счёта- "+id+" Баланс- "+balance+" Сумма зачисления- "+popolnit+" Сумма снятия- "+sniat);
   }
}

class TestBA{
    public static void main(String[] args) {
        BancAccount1 BA1 =new BancAccount1();
        BA1.id=12;
        BA1.balance=201.5;

        BA1.showInfo();
        BA1.popolnenieSheta(50.2);
        BA1.showInfo();
        BA1.snianieSoSheta(20.5);
        BA1.showInfo();
    }
}