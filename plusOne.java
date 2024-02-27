class Solution {
    public static int[] intToArr(int num){
        int count = (int) Math.log10(num)+1;
        int[] newArr  = new int[count];
        for(int i = count-1; i>=0; i--){
            newArr[i] = num%10;
            num =num/10;
        }

        return newArr;
    }
    public static int[] plusOne(int[] arr){
        int num = 0;
        int n = arr.length; //3
        for(int i=0; i<n; i++){
            num += arr[i]*Math.pow(10,n-i-1);
        }
        num++;
        return intToArr(num);
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        arr = plusOne(arr);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
