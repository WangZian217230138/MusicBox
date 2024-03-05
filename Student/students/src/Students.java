//import java.util.Arrays;

public class Students {

    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Students(String studentID,String studentName,int extraActivitiesNumber){
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[extraActivitiesNumber];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public String toString() {
        return "----------------------" + "\n" +
               "Student ID: " + studentID + "\n" +
               "Studwent Name: " + studentName + "\n" +
               "Extra Activities: " + String.join(", ", extraActivities) + "\n" +
               "----------------------";
    }

    public void addExtraActivity(int index, String activity) {
        if (index >= 0 && index < extraActivities.length) {
            extraActivities[index] = activity;
        } else {
            System.out.println("invalid");
        }
    }

}