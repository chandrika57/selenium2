package JavaBasics;

public class DuplicateValuesInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,2,3,6,5,7,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
