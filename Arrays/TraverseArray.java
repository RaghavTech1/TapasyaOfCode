package Arrays;

public class TraverseArray {
    int[] arr = null;
    public TraverseArray(int sizeofArray){
        arr = new int[sizeofArray];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void traverseArray(){
        try {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist.");
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
        TraverseArray TA = new TraverseArray(3);
        TA.insert(0, 0);
        TA.insert(1, 10);
        TA.insert(2, 20);
        TA.insert(1, 30);
        TA.insert(12, 120);

        System.out.print("Array Traversal ");
        TA.traverseArray();
    }
}