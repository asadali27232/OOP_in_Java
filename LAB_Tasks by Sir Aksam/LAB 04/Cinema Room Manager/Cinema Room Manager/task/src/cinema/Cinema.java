package cinema;

import java.util.Arrays;

public class Cinema {
    
    public static void main(String[] args) {
        int ROW = 7;
        int COL = 8;
        
        char[][] cinemaRoom = new char[ROW][COL];
        
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                cinemaRoom[ROW][COL] = 'S';
            }
        }
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8 9");
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                System.out.println((row + 1) + " " + cinemaRoom[row][col]);
            }
        }
    }
}