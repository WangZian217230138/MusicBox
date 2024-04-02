import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String filePath = "C:\\Users\\33844\\Downloads\\Groceries.txt";
        String fileToWrite = "C:\\Users\\33844\\Downloads\\ABC.txt";

        String[] array = new String[4];
       // String id;
        //String itemName;
        //String quantity;
        double price;
        //String temp = "";
        String separator = ",";
        double total = 0;


        FileReader fileReader = new FileReader(filePath);
        FileWriter fileWriter = new FileWriter(fileToWrite);


        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line;

        writer.write("****************************************************");
        writer.newLine();
        String heading;
        heading = "ID#" + "\t\t" + "Item" + "\t\t" + "Quantity" + "\t" +  "Price(€)";
        writer.write(heading);
        writer.newLine();


        while((line = bufferedReader.readLine()) !=null){

            array = line.split(separator);
            for(int i = 0;i<4;i++){
                if(array[i].length()<5){
                writer.write(array[i] + "\t\t");}
                else{
                    writer.write(array[i] + "\t");
                }
            }
            writer.newLine();

            price = Double.parseDouble(array[3]);
            total += price;

            System.out.println(line);
            
        }
        
        System.out.println("Total price is " + Math.round(total));



        writer.write("****************************************************");
        writer.write("\n" + "Total price of groceries: " + Math.round(total));
        writer.newLine();
        writer.write("****************************************************");


        bufferedReader.close();

        writer.flush();
        writer.close();
    }
}
