class JavaKa{

static String course="Html";
   


  static void notes(){
   System.out.println(course);
  }


   static String note(){
   course="core java";
     return course;
  }
 

public static void main(String[]args){
    notes();
    note();
    System.out.print(course);
    
 }
}
