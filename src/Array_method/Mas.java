package Array_method;


public class Mas {
/*
*
*
* ьфыььвфьывьфыв
*123123123123
**/

    private int size=0;
    private int mass[] = new int[size];

    public void setMas(int[] mass){
        this.mass= mass;
        this.size= mass.length;
    }
    public void getMas() {
        System.out.print("Mass is :"+"[");

        String delimiter = "";

        for (int element : mass) {
            if (element!=0) {
                System.out.print(delimiter + element);
                delimiter = "; ";
            }
        }
        System.out.println("]");
    }
    public String masToString(){
        if (isEmpty()){
            return "mas is empty";
        }
        String x="";
        for (int i = 0; i <mass.length ; i++) {
             x += mass[i]+ ", ";
        }
        x=x.substring(0, x.length()-2);
        x="["+x+"]";
        return x;
    }
    public int getSize(){
        return mass.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean numbOfFind(int numbOfFind) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == numbOfFind) {
                return true;
            }
        }
        return false;
    }
    public int numbOfindex(int numbOfindex) {
        numbOfindex--;
        for (int i = 0; i < mass.length; i++) {
            if (i == numbOfindex) {
//                System.out.println(mass[i]);
                return mass[i];
            }
        }
        return 0;
    }
    public void add(int el){
        if (size == mass.length){
            int [] NewMass = new int [size+5];
            for (int i=0; i<size;i++){
                NewMass[i] = mass[i];
            }
            mass = NewMass;
        }
        mass[size]= el;
        size++;
    }
    public void clearmas(){
        mass=new int[0];
    }
    public void deleteByIndex (int index) {
        if (index>size){
            System.out.println("Index not have array");
            return;
        }
            for (int i = 0; i < mass.length; i++) {
                if (i==index-1) {
                    mass[i] = 0;
                }
            }
    }
    public void contains(int newNumb) {
        int position=-1;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]==newNumb){
                position=i;
                System.out.println(newNumb+" have a array");
                break;
            }
        }
        System.out.println(newNumb+" not have a array");
    }
    public  void sort() {

        for(int i = mass.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( mass[j] > mass[j+1] ){
                int tmp = mass[j];
                mass[j] = mass[j+1];
                mass[j+1] = tmp;
            }
        }
    }

    }

}
