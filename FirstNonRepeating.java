import java.util.*;
public class FirstNonRepeating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemetns");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                   break;
                }
            }
            if(count==0){
                System.out.println("First non-repeating elements is: "+arr[i]);
                return;
            }
            
        }
        
    }
}