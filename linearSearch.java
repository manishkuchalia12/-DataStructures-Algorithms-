public class linearSearch  {
    public static int LinearSearch(int numbers[], int target){

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                return i; // Return the index if target is found
            }
           
        }
         return -1; // Return -1 if target is not found
    }

public static void main(String[] args) {
    int numbers[] = {1, 2, 3, 4, 15, 6, 7, 8, 9};
    int target = 15;
    int index = LinearSearch(numbers, target);
    if(index != -1) {
        System.out.println("Target found at index: " + index);
    } else {
        System.out.println("Target not found in the array.");
    }
}
    
}
