public class Max_num_one {
    public static void main(String[] args) {
        int[] arr={10,70,7,6,8,50};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }
        System.out.println("max element in an array is:"+max);
    }
    
}
