package Numb_Fibonacci;

public class Array {
    private int size=0;

    private long  mass[] = new long [size];
    public void add(long el){
        if (size == mass.length){
            long [] NewMass = new long [size+5];
            for (int i=0; i<size;i++){
                NewMass[i] = mass[i];
            }
            mass = NewMass;
        }
        mass[size]= el;
        size++;
    }

    public void getMas() {
        System.out.print("Mass is :"+"[");

        String delimiter = "";

        for (long element : mass) {
            if (element!=0) {
                System.out.print(delimiter + element);
                delimiter = "; ";
            }
        }
        System.out.println("]");
    }

    public long numbOfindex(long numbOfindex) {
        numbOfindex--;
        for (int i = 0; i < mass.length; i++) {
            if (i == numbOfindex) {
                return mass[i];
            }
        }
        return 0;
    }


    public boolean BinarySearch_Iter( long key)
    {
        int left = 0;
        int right = mass.length;
        int mid = 0;

        while (!(left >= right))
        {
            mid = left + (right - left) / 2;

            if (mass[mid] == key)
                return true;

            if (mass[mid] > key)
                right = mid;
            else
                left = mid + 1;
        }

        return false;
    }
}
