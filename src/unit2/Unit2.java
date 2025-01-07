package unit2;



public class Unit2 {
    public static void main(String[] args) {
        System.out.println("Main");
        student student = new student();
        student.roll=1;
        student.gen='M';
        student.name="GOGO";
        student.weight=22.60f;
        student.phone="9875463245";
        student.dob="10-08-1999";
        System.out.println("name " +student.name+" Gender "+student.gen);
        student.register();
        student.cgpa();
    }
}


  class student {
      String name;
      char gen;
      String dob;
      String phone;
      int roll;
      float weight;

      public student(String name, char gen, String dob, String phone, int roll, float weight) {
          this.name = name;
          this.gen = gen;
          this.dob = dob;
          this.phone = phone;
          this.roll = roll;
          this.weight = weight;
      }

      public student() {
          System.out.println("default constructor");
      }


      void register() {

      }


      void cgpa() {

      }
  }


