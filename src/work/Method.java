package work;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Method {
    int SIZE_OF_SALE=10;
    int SIZE_OF_BUY=10;
    int [] price_of_sale = new int [SIZE_OF_SALE];
    int [] count_action_for_sale = new int [SIZE_OF_SALE];

    int [] price_of_buy = new int [SIZE_OF_BUY];
    int [] count_action_for_buy = new int [SIZE_OF_BUY];



    private Scanner file;

    public void close_file(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void  openFile(String fileName) {
        try {
            file = new Scanner(new File(fileName));
        }catch (Exception e){
            System.out.println("file don't find ");
        }
    }

    public void readNumb (){
        int i = 0;
        int j=0;
        while (file.hasNext()) {
            String type = file.next();
            String price = file.next();
            String count = file.next();
            String type1 = file.next();
            if (type1.equals("bid")) {
                SIZE_OF_SALE++;
                int pr = Integer.parseInt(price);
                int co = Integer.parseInt(count);
                price_of_sale[i] = pr;
                count_action_for_sale[i] = co;
                i++;
            }
            if(type1.equals("ask")){
                SIZE_OF_BUY++;
                int pr = Integer.parseInt(price);
                int co = Integer.parseInt(count);
                price_of_buy[j] = pr;
                count_action_for_buy[j] = co;
                j++;
            }
            System.out.println(type +" " + price+" " + count +" "+ type1);
        }
    }
    public void showArraySale(){
        if (price_of_sale.length==0){
            System.out.println("Operation impossible");

        }

        System.out.println("Price \t Count");
        for (int i = 0; i <price_of_sale.length ; i++) {
            if (price_of_sale[i] == 0) {
                continue;
            }
            System.out.println(price_of_sale[i] + "\t"+ "\t " + count_action_for_sale[i]);
        }
    }
    public void showArrayBuy(){
        if (price_of_buy.length==0){
            System.out.println( "operation impossible");
        }

        System.out.println("Price \t Count");
        for (int i = 0; i <price_of_buy.length ; i++) {
            if (price_of_buy[i] == 0) {
                continue;
            }
            System.out.println(price_of_buy[i] + "\t"+ "\t " + count_action_for_buy[i]);
        }
    }
    public boolean bestSale(){
        int max=0;
        int index= 0;
        if(SIZE_OF_SALE==0){
            return false;
        }
        for (int i = 0; i <price_of_sale.length ; i++) {
            if(price_of_sale[i]>max){
                max = price_of_sale[i];
                index = i;
            }
        }
        System.out.print("Max cost action for sale is: "+ max + "\t\t " +"Count is: "+ count_action_for_sale[index]+"\n");
        return true;
    }
    public boolean bestBuy(){
        int max=0;
        int index= 0;
        if(SIZE_OF_BUY==0){
            return false;
        }
        for (int i = 0; i <price_of_buy.length ; i++) {
            if(price_of_buy[i]>max){
                max = price_of_buy[i];
                index = i;
            }
        }
        System.out.print("Max cost action for buy is: "+ max + "\t\t " +"Count is: "+ count_action_for_buy[index]+"\n");
        return true;
    }
    public int findAcytionByPrice(int data){
       if (price_of_buy.length==0){
           return -1;
       }
       if (price_of_sale.length==0){
           return -1;
       }

        for (int i = 0; i <price_of_buy.length; i++) {
            if (price_of_buy[i]==data){
                return data;
            }
        }
        for (int i = 0; i <price_of_sale.length; i++) {
            if (price_of_sale[i]==data){
                return data;
            }
        }

        return data;
    }

    public boolean deleteAcytionByPrice() {
        int min=0;

        if (price_of_buy.length == 0) {
            return false;
        }
        if (price_of_sale.length == 0) {
            return false;
        }

        for (int i = 0; i <price_of_buy.length ; i++) {
            if(price_of_buy[i]<min){
                min = price_of_buy[i];
            }
            if (price_of_buy[i]==min){
                price_of_buy[i]=' ';
                count_action_for_buy[i]=' ';
            }
        }

        return true;
    }
}
