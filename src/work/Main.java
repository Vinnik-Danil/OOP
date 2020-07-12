package work;


public class Main {
    public static void main(String[] args) {
        Method method = new Method();

        method.openFile("C:/Users/danik/Documents/Stock.txt");
        method.readNumb();
        System.out.println("Action for sale");
        method.showArraySale();
        System.out.println("\nAction for buy");
        method.showArrayBuy();
        System.out.println(method.bestSale());
        System.out.println(method.bestBuy());
        System.out.println(method.findAcytionByPrice(541));
        System.out.println(method.deleteAcytionByPrice());
        method.showArraySale();


    }
}
