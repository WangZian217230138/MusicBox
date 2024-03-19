package com.example123;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {

    Scanner reader = new Scanner(System.in);
    Queue<Performance> performance = new LinkedList<>();

    public void handlePerformances(){
        int choice = 0;
        do{
            System.out.println("\n" + "Here are the performance operations available to you" + "\n");
            System.out.println("Type 1 to add performances");
            System.out.println("Type 2 to display the list of performances" + "\n");
            System.out.println("Type 3 to start performaces" + "\n");
            System.out.println("Type 4 to quit" + "\n");
            choice = reader.nextInt();
            reader.nextLine();
            switch(choice){
                case 1:
                System.out.println("How many performances would you like to add");
                int num = reader.nextInt();
                reader.nextLine();
                addPerformances(num);
                break;
                case 2:
                displayPerformances();
                break;
                case 3:
                startPerformances();
                break;
                case 4:
                break;
                default:
                System.out.println("Invalid choice");

                
            }
        }while(choice !=4);
    }


    public void addPerformances(int numOfPerformances){
        int i = 0;
        do{
            System.out.println("Enter the performance ID");
            String ID = reader.nextLine();
            
            System.out.println("Enter the performance name");
            String name = reader.nextLine();

            System.out.println("Enter the performance lead name");
            String leadName = reader.nextLine();

            System.out.println("Enter the rank of the performance ");
            char group = reader.nextLine().charAt(0);

            Performance perform = new Performance(ID, name, leadName, group);
            performance.offer(perform);
            i++;
        }while(i<numOfPerformances);
    }

    public void displayPerformances(){
        System.out.println("The list of performances :" + performance);
    }

    public void startPerformances(){
        System.out.println("The next performance is" + performance.poll());
    }

    

    

}
