package core_java;

public class Course {
    int Course_Id;
    String Course_Name;
    int Course_Duration;

    public Course(int Course_Duration,int Course_Id,String Course_Name) {
       this.Course_Duration = Course_Duration;
        this.Course_Id=Course_Id;
        this.Course_Name=Course_Name;
    }
}
