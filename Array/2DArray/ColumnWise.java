class ColumnWise{
    public static void main(String[] args) {
    int[][] arr={{1,2,3},{4,5,6},{5,8,3}};
    for(int j=0;j<arr[0].length;j++){
        int colsum=0;

        for(int i=0;i<arr.length;i++){
            colsum+=arr[i][j];



        }
    
    System.out.println("colsum"+j+"is:"+colsum);
    }


    }
}