public class Main {

    public static void main(String[] args) {

        StudentProfile profileOne = new StudentProfile("joao", "neves", 7.5,2024);
        StudentProfile profileTwo = new StudentProfile("karla", "batista",8.3, 2023);

        profileTwo.incrementYearExpectedGraduation();
        System.out.println(profileTwo.yearGraduation);

        profileOne.incrementYearExpectedGraduation();
        System.out.println(profileOne.yearGraduation);

    }
}