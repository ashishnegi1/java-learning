
public class restrictions {
    public static void main(String[] args) {
        Object[] strings = new String[1];
        strings[0] = 100; // throws java.lang.ArrayStoreException beacuse a string array is intantiated above
        Integer[] arr = new Integer[1];
        arr[0] = 100;
    }
}
