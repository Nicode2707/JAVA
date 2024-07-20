public class constru {
   public static void main(String[] args) {
    student s1 = new student("Niraj Chaudhary");
    System.out.println(s1.name);
   }
    
}

class student {
  String name;
  int roll;

  student(String string){
    this.name = string;
  }
}
