public class Min_array_one {
    public static void main(String[] args) {
        int[] arr={10,70,7,6,8,50};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }


        }
        System.out.println("min element in an array is:"+min);
    }
    
}
