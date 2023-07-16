public class Missing {
    public static void main(String[] args) {
      int arr[]={4,0,2,1};
      element(arr);
      int ans=missing(arr);
      System.out.println(ans);
    }
    static void element(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]) {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else i++;
        }
    }
     static int missing(int arr[]){
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index) {
                return index;
            }
        }
    return arr.length;
     }
}