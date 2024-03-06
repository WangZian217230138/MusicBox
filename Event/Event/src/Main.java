import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    

    public static void main(String[] args){
        Event a = new Event();
        System.out.println("How many events do you want to add ");
        Scanner reader = new Scanner(System.in);

        int times=reader.nextInt();
        a.addevent(times);

        ArrayList<String> eventAttendees = new ArrayList<String>();

        //public void organizeEvent(ArrayList<String> al,int choice){
int choice;

            do{
            System.out.println("Enter 1 to add attendee" + "\n");
            System.out.println("Enter 2 to remove attendee" + "\n");
            System.out.println("Enter 3 to update attendee" + "\n");
            System.out.println("Enter 4 to search attendee" + "\n");
            System.out.println("Enter 5 to display all attendees" + "\n");
    
    
            choice = reader.nextInt();
            reader .nextLine();    
            switch(choice){
                case 1 :
                System.out.println("Add the name of  an attendee" + "\n");
                String addname = reader.nextLine();
                eventAttendees.add(addname);
                break;
    
                case 2 :
                System.out.println("Remove the name of the attendee : " + "\n");
                String removename = reader.nextLine();
                eventAttendees.remove(removename);
                break;
    
                case 3 :
                System.out.println("The name of the attendee you want to update" + "\n" + "Enter the sequence number:");
                String updatename = reader.nextLine();
                int i=reader.nextInt();
                reader.nextLine();
                eventAttendees.set(i, updatename);
                break;
    
                case 4 :
                System.out.println("Enter the attendee you want to search: " + "\n");
                String searchname = reader.nextLine();
                if(eventAttendees.contains(searchname)){
                    System.out.println(searchname + " is in the list" + "\n");
                }
                else{
                    System.out.println(searchname + " is not in the list" + "\n");
                }
                break;
    
                case 5 : 
                System.out.println(eventAttendees);
                break;
    
                default:
                System.out.println("Invalid choice");
    
                   reader.close();     
            }
    
    
        }while(choice!=5);

    }

    }

