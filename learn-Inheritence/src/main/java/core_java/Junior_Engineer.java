package core_java;

public class Junior_Engineer extends Employee {
    int Assessment_Score;
    String Feedback;

    public Junior_Engineer(int Id, String name, double salary, String Floor_number, String Street_Name, String City_Name, String State, String Country, int assessment_Score, String feedback) {
        super(Id, name, salary, Floor_number, Street_Name, City_Name, State, Country);
        Assessment_Score = assessment_Score;
        Feedback = feedback;
    }

    void details(){

    }
}
