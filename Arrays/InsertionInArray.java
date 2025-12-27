package Arrays;

public class InsertionInArray {
    int[] arr = null;
    public InsertionInArray(int sizeofArray){
        arr = new int[sizeofArray];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location , int valueToBeInserted){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("sucessfully inserted");
            } else {
                System.out.println("Occupied space");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }
    public static void main(String[] args) {
        InsertionInArray iia = new InsertionInArray(10);
        iia.insert(0, 0);
        iia.insert(1, 10);
        iia.insert(2, 20);
        iia.insert(1, 30);
        iia.insert(12, 120);
    }
}