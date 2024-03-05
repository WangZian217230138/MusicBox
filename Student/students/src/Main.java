import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Student ID");
        String studentID = reader.nextLine();
        System.out.println("Enter Student name");
        String studnetName = reader.nextLine();
        System.out.println("Enter activities number");
        int extraActivitiesNumber = reader.nextInt();
        reader.nextLine();

        Students student = new Students(studentID,studnetName,extraActivitiesNumber);
        
        
        for (int i = 0; i < extraActivitiesNumber; i++) {
            System.out.print("Enter extra activity " + (i + 1) + ": ");
            String activity = reader.nextLine();
            student.addExtraActivity(i, activity);
        }

        System.out.println(student);

        reader .close();
    

    }

}