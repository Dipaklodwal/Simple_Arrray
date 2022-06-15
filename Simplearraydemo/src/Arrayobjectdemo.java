class Student{
    int rollno;
    String name;
    String add;
    public Student(int rollno,String name,String add) {
    this.rollno= rollno;
    this.name=name;
    this.add=add;
    }
}
        
    class Arrayiobjectdemo{
        public static void main(String[] args) {
         Student student[];
         student=new Student[5];
         student[0]=new Student (1,"pritik",",Jalna");
         student[1]=new Student(2,"Kajal",",Ambad");
         student[2]=new Student(3,"Umakant",",Aurangabad");
         student[3]=new Student(4," navin",",mumbai");
         student[4]=new Student(5,"Neha",",Bhokardan");
        for(int i=0;i<student.length;i++){
            System.out.println("Element At index:="+i+ ":"+ student[i].rollno+" "+student[i].name+" "+student[i].add);
              }
          }
    }
    
