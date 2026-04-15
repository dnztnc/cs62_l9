import java.util.ArrayDeque;
import java.util.Queue;

public class RisingTides {
    public static boolean[][] floodedRegionsIn(double[][] terrain,
                                               GridLocation[] sources,
                                               double height) {

        // variables to store the rows and columns of the terrain                                        
        int numRows = terrain.length;
        int numCols = terrain[0].length;

        // create the flooded array
        boolean[][] flooded = new boolean[numRows][numCols];

        // create an empty queue for bfs.
        // TODO: What is the type of the objects in queue?
        //Queue<_________> queue = new ArrayDeque<>();

        // for (each water source at or below the water level)
    

            // flood that square
            // add that square to the queue 

        // while (the queue is not empty)
            // dequeue a position from the front of the queue
            
            // for (each square adjacent to the position in a cardinal direction) 
            
                // if index out of bounds, skip checking this square 
               
                // if (that square is at or below the water level and isn't yet flooded)
                    // flood that square
                    // add that square to the queue

        return flooded;
    }

    public static void printGrid(boolean[][] grid) {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                if (cell) System.out.print(" T ");
                else System.out.print(" F ");
            }
            System.out.println(); //new line
        }
    }

     public static void main(String[] args) {
        // Test 1: Single flood source, flat terrain
        double[][] terrain1 = {
            {1, 1, 1},
            {1, 1, 1}
        };
        GridLocation[] sources1 = {new GridLocation(0, 0)};
        boolean[][] result1 = floodedRegionsIn(terrain1, sources1, 1.0);
        System.out.println("Test 1: Single source, flat terrain, height=1. Expected all true:");
        printGrid(result1);

        // Test 2: Flood height too low
        double[][] terrain2 = {
            {5, 5},
            {5, 5}
        };
        GridLocation[] sources2 = {new GridLocation(0, 0)};
        boolean[][] result2 = floodedRegionsIn(terrain2, sources2, 1.0);
        System.out.println("Test 2: Height too low, expected all false:");
        printGrid(result2);

        // Test 3: Multiple sources with uneven terrain
        double[][] terrain3 = {
            {1, 2, 3},
            {4, 1, 2},
            {3, 4, 1}
        };
        GridLocation[] sources3 = {new GridLocation(0, 0), new GridLocation(2, 2)};
        boolean[][] result3 = floodedRegionsIn(terrain3, sources3, 2.0);
        System.out.println("Test 3: Height=2, two sources. Expected flooding at (0,0), (0,1), (1,1), (2,2):");
        printGrid(result3);

        // Test 4: Center flooded
        double[][] terrain4 = {
            {5, 5, 5},
            {5, 1, 5},
            {5, 5, 5}
        };
        GridLocation[] sources4 = {new GridLocation(1, 1)};
        boolean[][] result4 = floodedRegionsIn(terrain4, sources4, 2.0);
        System.out.println("Test 4: Surrounded by high terrain, expected only center flooded:");
        printGrid(result4);
    }
}
