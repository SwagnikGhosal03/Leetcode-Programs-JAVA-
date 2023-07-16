import java.util.ArrayList;
import java.util.List;

public class Disappeared{
    public static void main(String[] args) {
     int arr[]={1,4,7,8,3,2,3,2};
     elements(arr);
     System.out.println(answer(arr));
}
    static void elements(int arr[]){
      int i=0;
      while(i<arr.length-1){
        int correct=arr[i]-1;
        if (arr[correct]!=arr[i]) {
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }
        else i++;
      }
    }
      static List<Integer> answer(int arr[]){
      List<Integer> ans= new ArrayList<>();
      for (int index = 0; index < arr.length; index++) {
        if(arr[index]!=index+1){
            ans.add(index+1);
        }
      }
      return ans;
    }
}