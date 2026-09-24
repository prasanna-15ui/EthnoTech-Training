public class Largest {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int largest=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is:"+largest);

    }
    
}
