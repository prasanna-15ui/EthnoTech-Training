
    
public class Reverse {
    public static void main(String[] args) {

        int[][][] arr = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };

        int total = arr.length * arr[0].length * arr[0][0].length;

        for (int x = 0; x < total / 2; x++) {

            int a = x;
            int b = total - 1 - x;

            int i1 = a / 6;
            int j1 = (a % 6) / 3;
            int k1 = a % 3;

            int i2 = b / 6;
            int j2 = (b % 6) / 3;
            int k2 = b % 3;

            int temp = arr[i1][j1][k1];
            arr[i1][j1][k1] = arr[i2][j2][k2];
            arr[i2][j2][k2] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
