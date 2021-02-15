package Trash;

public class Car {
    Car(String Модель, String Цвет, String Мотор, int Скорость){  //Создание конструктора класса Car
        System.out.println("Машина создана!!! ");
    mod=Модель;
    color=Цвет;
    engine=Мотор;
    speed=Скорость;

    }

    String color;
    String engine;
    String mod;
    int speed;



    int gaz(int Ускорение) {
    speed +=Ускорение;
    return speed;
    }

    int Тормоз(int Ускорение) {
    speed -=Ускорение;
    return speed;
    }


    void showInfo(){
        System.out.println("Модель машины: " +mod);
        System.out.println("Цвет машины: " +color);
        System.out.println("Объём двигателя: " +engine);
        System.out.println("Скорость: " +speed);
    }

}


   class CarTest{
       public static void main(String[] args) {
           Car car1= new Car("Ford", "Black", "V8",20 );
           Car car2=new Car("Лада седан ", "Баклажан ", "1.2",60);

           car1.showInfo();
           car1.gaz(40);
           car1.showInfo();
           car1.Тормоз(60);
           car1.showInfo();


       }


   }