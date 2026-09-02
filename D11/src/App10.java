public class App10 {

    public static void main(String[] args) {

        String[][] matrix = {
            {"A", "B", "C", "D"},
            {"E", "F", "G", "H"},
            {"I", "J", "K", "L"},
            {"M", "N", "O", "P"}
        };

        String target = "K";

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col].equals(target)) {

                System.out.println("Element found");
                System.out.println("Row = " + row);
                System.out.println("Column = " + col);
                return;

            } else if (matrix[row][col].compareTo(target) > 0) {

                col--;

            } else {

                row++;
            }
        }

        System.out.println("Element not found");
    }
}   