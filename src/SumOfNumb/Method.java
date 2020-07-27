package SumOfNumb;

public class Method {
    public boolean BinarySearch_Iter(int[] mass, long key)
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
