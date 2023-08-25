//Bubble Sort using Java
// Pushes Maximum element to the end of the array in every iteration

public class BubbleSort{
    static void Bubble_Sort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,32,2,0,23,22,99,31};
        Bubble_Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}