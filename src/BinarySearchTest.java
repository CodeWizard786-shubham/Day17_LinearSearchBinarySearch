public class BinarySearchTest {
    public static void binarySearch(int arr[],int first,int last,int key){
        int mid=(first+last)/2;
        while(first <=last){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key=3;
        int last=arr.length-1;
        int first=0;
        binarySearch(arr,first,last,key);
    }
}
