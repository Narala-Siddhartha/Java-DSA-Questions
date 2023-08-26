//Insertion Sort using Java
//Places the taken element at its correct position
public class InsertionSort{
    static void Insertion_Sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,32,2,0,23,22,99,31};
        Insertion_Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}