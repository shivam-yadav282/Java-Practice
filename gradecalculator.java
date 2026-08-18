import java.util.Scanner;


public class gradecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for subject 1:");
        int subject1 = sc.nextInt();
        System.out.println("Enter marks for subject 2:");
        int subject2 = sc.nextInt();
        System.out.println("Enter marks for subject 3:");
        int subject3 = sc.nextInt();

        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300.0) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close(); // ✅ Close scanner after use
    }
    
}
