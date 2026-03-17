public class JaggedArray {
    public static void main(String[] args) {

        int[][] data = {
            {10, 20},
            {30, 40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("=== JAGGED ARRAY ===");

        for (int i = 0; i < data.length; i++) {
            System.out.print("Baris " + i + " (" + data[i].length + " elemen) : ");

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }

            System.out.println();
        }
    }
}