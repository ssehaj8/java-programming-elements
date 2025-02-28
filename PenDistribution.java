public class PenDistribution {
    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;
        
        // Total number of students
        int students = 3;

        // Calculate how many pens each student will get using division operator
        int pensPerStudent = totalPens / students;

        // Calculate the remaining pens using modulus operator
        int remainingPens = totalPens % students;

        // Display the result in a single print statement
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}

