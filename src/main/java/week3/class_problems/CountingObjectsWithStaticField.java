package week3.class_problems;

public class CountingObjectsWithStaticField {
    static class Applicant {
        static int totalApplicants;

        Applicant() {
            totalApplicants++;
        }
    }

    public static void main(String[] args) {
        new Applicant();
        new Applicant();
        new Applicant();
        System.out.println("Total applicants: " + Applicant.totalApplicants);
    }
}
