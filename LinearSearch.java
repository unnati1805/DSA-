public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,6,1,8};
        int key = 6;
        System.out.println(linearSearch(arr, key));
    }
}
