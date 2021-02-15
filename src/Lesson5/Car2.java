package Lesson5;

  public class Car2 { //создали класс Car2.

    String color; // Создали переменные класса Car2.
    String engine;
    int speed;

    int gaz(int skorost) {   // Создали метод gaz с типом данных int, с переменной skorost типа int,
      speed += skorost;      // Сложили значенеия переременной класса speed и переменной метода skorost. Результат присвоили переменной класса speed.
      return speed;          // Вернули переменную класса speed.
    }

    int tormoz(int skorost) {
      speed -= skorost;
      return speed;
    }

    void showInfo() {
      System.out.println(" cvet: " + color + " motor: " + engine + " skorost: " + speed + " k/h.");

    }
  }


  class Car2test {
    public static void main(String[] args) {
      Car2 c1 =new Car2();
      c1.color ="White";
      c1.engine = "V6";
      c1.speed = 60;

      c1.showInfo();
      c1.gaz(20);
      c1.showInfo();
      c1.tormoz(80);
      c1.showInfo();
    }

  }

