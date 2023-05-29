package com.premiumminds.internship.snail;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Created by aamado on 05-05-2023.
 * Implementation of ISnailShellPattern
 * This class will go through a matrix in a snail shell pattern
 * Skeleton of project provided by Premium Minds
 * @author Tomás Salgueiro github.com/Tomathy-dev
 */
class SnailShellPattern implements ISnailShellPattern {

  /**
   * Method to get snailshell pattern
   * 
   * @param matrix matrix of numbers to go through
   * @return order array of values thar represent a snail shell pattern
   */
  public Future<int[]> getSnailShell(int[][] matrix) {
    CompletableFuture<int[]> future = new CompletableFuture<>();
    int maxX = matrix[0].length;
    int maxY = matrix.length;
    int minX = 0;
    int minY = 0;
    int elements = maxX * maxY;
    int[] result = new int[elements];
    int x = 0;
    int y = 0;
    int i = 0;
    // This loop will go through the matrix in a snail shell pattern
    // It will go through the top row, right column, bottom row and left column sequentially, ignoring the ones that have already been gone through
    while(i < elements){
        // This loop will go through the top row and then will ignore it for future loops
        while(x < maxX){
            result[i] = matrix[y][x];
            x++;
            i++;
        }
        x--;
        y++;
        minY++;
        // This loop will go through the right column and then will ignore it for future loops
        while(y < maxY){
            result[i] = matrix[y][x];
            y++;
            i++;
        }
        y--;
        x--;
        maxX--;
        // This loop will go through the bottom row and then will ignore it for future loops
        while(x >= minX){
            result[i] = matrix[y][x];
            x--;
            i++;
        }
        x++;
        y--;
        maxY--;
        // This loop will go through the left column and then will ignore it for future loops
        while(y >= minY){
            result[i] = matrix[y][x];
            y--;
            i++;
        }
        y++;
        x++;
        minX++;
    }

    future.complete(result);
  return future;
  };
}
