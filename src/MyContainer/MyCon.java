package MyContainer;

public class MyCon{

    private int SIZE=0;
    private Object[] obj = new Object[0];


    public int size (){
        return SIZE;
    }
    public boolean add(Object object){
        Object[] newArray= new Object[obj.length+1];
        for (int i = 0; i <obj.length ; i++) {
            newArray[i]= obj[i];
        }
        newArray[obj.length]=object;
        obj=newArray;
        SIZE++;
        return true;
    }
    public boolean isEmpty(){
        return SIZE==0;
    }
    public String toString(){

        if (obj==null) {
            System.out.println("My collection: []");
            return "";
        }

        String result ="";
        for (Object o : obj) {
            if (obj[0] == null) {
                continue;
            }
            result += (o + ", ");
        }
        if (result.length() != 0) {
            result = result.substring(0, result.length() - 2);
        }
        return "My container is: " + "[" + result + "]";
    }

    public void addAll(MyCon container){

        for (int i = 0; i <container.obj.length ; i++) {
            add(container.obj[i]);
        }
    }
    public void clear(){
        obj = new Object[0];
        SIZE=0;
    }
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null) {
                continue;
            }
            if (obj[i].equals(object)) {
                return true;
            }
        }

        return false;
    }
    public boolean remove(Object object) {
        if (object == null) {
            return false;
        }

        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null) {
                continue;
            }
            if (obj[i].equals(object)) {
                obj[i] = null;
            }
        }
        SIZE--;
        return true;
    }

    public boolean removeAll(MyCon container){
        Object[] newArray= new Object[obj.length];
        for (int i = 0; i <obj.length ; i++) {
            if(container.obj[i].equals(container)){
                 obj[i]=null;
            }
        }
       // System.out.println(newArray);
        obj=newArray;
        return true;
    }
    public boolean containsAll(MyCon container) {
        if (container == null) {
            return false;
        }
        if (container.SIZE == 0) {
            return false;
        }

        Object[] newArray = container.getArray();

        for (Object element : newArray) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray(){
        System.arraycopy(obj,0,new Object[obj.length], 0,obj.length);
        return toArray();
    }

    public Object[] getArray() {
        Object[] newArray = new Object[SIZE];

        if (SIZE == 0) {
            return newArray;
        }
        int i = 0;
        for (Object element : obj) {
            if (element != null) {
                newArray[i] = element;
                i++;
            }
        }
        return newArray;
    }

    public int sum(){
        int result=0;
        for (Object o : obj) {
            Integer i =(Integer) o;
            result+=i;
        }
        return result;
    }
}
