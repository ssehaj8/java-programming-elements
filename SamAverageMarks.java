public class SamAverageMarks {
    public static void main(String[] args) {
        // Marks in each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        //the average percentage
        int totalMarks = maths + physics + chemistry;
        int numberOfSubjects = 3;
        int average = (totalMarks *100)/300;

        //result
        System.out.println("Sam average mark in PCM is " + average);
    }
}
