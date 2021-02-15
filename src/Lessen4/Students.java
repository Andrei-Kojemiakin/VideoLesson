package Lessen4;

public class Students {

    int StudID;
    String Fname,Sname,YearStuding;
    float AvReitengM,AvReitengE,AvReitengL;
    double AvReiteng=1.0;
}

class StudentsTest{

 public static void main(String[] args) {

     Students VasiliTerkin = new Students();
     Students GrigoriLeps = new Students();
     Students DickCocongton = new Students();

      VasiliTerkin.StudID=12;
      VasiliTerkin.Fname="Terkin";
      VasiliTerkin.Sname="Vasili";
      VasiliTerkin.YearStuding="2018s.y.";
      VasiliTerkin.AvReitengM=7;
      VasiliTerkin.AvReitengE=9;
      VasiliTerkin.AvReitengL=6;

     VasiliTerkin.AvReiteng=(VasiliTerkin.AvReitengM+VasiliTerkin.AvReitengE+VasiliTerkin.AvReitengL)/3;
     System.out.println("Средний бал Васи " +VasiliTerkin.AvReiteng);

      GrigoriLeps.StudID=14;
      GrigoriLeps.Fname="Leps";
      GrigoriLeps.Sname="Grigori";
      GrigoriLeps.YearStuding="2019s.y.";
      GrigoriLeps.AvReitengM=5;
      GrigoriLeps.AvReitengE=7;
      GrigoriLeps.AvReitengL=8;

     GrigoriLeps.AvReiteng=(GrigoriLeps.AvReitengM+GrigoriLeps.AvReitengE+GrigoriLeps.AvReitengL)/3;
     System.out.println("Средний бал Грыши " +GrigoriLeps.AvReiteng);

     DickCocongton.StudID=13;
     DickCocongton.Fname="Cocongton";
     DickCocongton.Sname="Dick";
     DickCocongton.YearStuding="2019s.y.";
     DickCocongton.AvReitengM=8;
     DickCocongton.AvReitengE=9;
     DickCocongton.AvReitengL=8;

     DickCocongton.AvReiteng=(DickCocongton.AvReitengM+DickCocongton.AvReitengE+DickCocongton.AvReitengL)/3;
     System.out.println("Средний бал Дика " +DickCocongton.AvReiteng);

     //AvReiteng=(AvReitengM+AvReitengE+AvReitengL)/3;
   //System.out.println(AvReiteng);



 }
}
