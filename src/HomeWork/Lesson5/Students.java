package HomeWork.Lesson5;

public class Students {

    int StudID;
    String Fname,Sname,YearStuding;
    float AvReitengM,AvReitengE,AvReitengL;
    double AvReiteng;
}

class StudentsTest{

    double middleGrade(Students st){
        double AvReiteng = (st.AvReitengM + st.AvReitengE + st.AvReitengL)/3;
        int a=(int)Math.round(AvReiteng); // Усечение рациональных чисел до целых
        System.out.println(" Средняя оценка студента " + st.Sname +st.Fname + ": " + a);
        return AvReiteng;
    }

 public static void main(String[] args) {

     Students st1 = new Students();
     st1.StudID=12;
     st1.Fname="Terkin";
     st1.Sname="Vasili";
     st1.YearStuding="2018s.y.";
     st1.AvReitengM=7;
     st1.AvReitengE=9;
     st1.AvReitengL=6;

     Students st2 = new Students();
     st2.StudID=14;
     st2.Fname="Leps";
     st2.Sname="Grigori";
     st2.YearStuding="2019s.y.";
     st2.AvReitengM=5;
     st2.AvReitengE=7;
     st2.AvReitengL=8;

     Students st3 = new Students();
     st3.StudID=13;
     st3.Fname="Cocongton";
     st3.Sname="Dick";
     st3.YearStuding="2019s.y.";
     st3.AvReitengM=8;
     st3.AvReitengE=9;
     st3.AvReitengL=8;

     StudentsTest sTest = new StudentsTest();
     sTest.middleGrade(st1);
     sTest.middleGrade(st2);
     sTest.middleGrade(st3);



     //AvReiteng=(AvReitengM+AvReitengE+AvReitengL)/3;
   //System.out.println(AvReiteng);



 }
}
