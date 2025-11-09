public class Student {
    private int id;
    private String name;
    private int age;
    private String courses;
    private double marks;

    public Student(int id,String name,int age,String courses,double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = courses;
        this.marks = marks;
         //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourses(){
        return courses;
    }
    public double getMarks(){
        return marks;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCourses(String courses){
        this.courses = courses;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    @Override
    public String toString() {
        return id + " | "+ name +" | "+age+" | "+courses+" | "+marks;
    
    }
}
