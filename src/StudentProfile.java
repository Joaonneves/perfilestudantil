public class StudentProfile {

    String name;
    String lastName;
    double gpa;
    int yearGraduation;

    public StudentProfile(String name, String lastName, double gpa, int yearGraduation) {
        this.name = name;
        this.lastName = lastName;
        this.gpa = gpa;
        this.yearGraduation = yearGraduation;
    }

    public void incrementYearExpectedGraduation(){
        this.yearGraduation = this.yearGraduation + 1;

    }

}
