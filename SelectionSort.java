//Selection Sort using Java
// Selects minimum element and places it at the current index of outer loop

public class SelectionSort{
    static void Selection_Sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,32,2,0,23,22,99,31};
        Selection_Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}