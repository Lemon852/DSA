class QuickSort{
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1; // for counting the elemnts that are lower
        for(int j = low; j<high; j++){
            if(arr[j]<pivot){
                
                i++; 
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        
        }
        i++;
        // increase the final size and swap the pivot to its value in sorted list
        int temp = arr[i];
        arr[i] =  arr[high];
        arr[high] = temp;
        return i; // return its index
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){  // only sort 
            int pivot = arr[high];  //starting pivot element as last element
            int pidx = partition(arr, low,high); // secondary function for fragments after pivot
            
            quickSort(arr, low, pidx-1); // recurisve call for first lower array
            quickSort(arr, pidx+1, high); //recursive call for other half
            
        }
    }
    public static void main(String args[]){
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);  
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }    
    }
}