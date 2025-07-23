class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int med = arr[(n-1)/2];
        int i=0, j=n-1;
        int res = 0;
        int[] result = new int[k];

        while(res < k){
            if(Math.abs(arr[i]-med) > Math.abs(arr[j]-med)){
                result[res] = arr[i];
                i++;
                res++;
            }
            else{
                result[res] = arr[j];
                j--;
                res++;
            }
        }
        return result;
    }
}