class Print3DArray{
    public static void main(String[] args) {
        int[][][] arr={{{1,2,3},{2,3,4}},{{3,6,9},{4,8,12}},{{2,4,6},{5,10,15}}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}