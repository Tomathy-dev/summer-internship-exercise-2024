package com.premiumminds.internship.snail;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Created by aamado on 05-05-2023.
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
    while(i < elements){
        while(x < maxX){
            result[i] = matrix[y][x];
            x++;
            i++;
        }
        x--;
        y++;
        minY++;
        while(y < maxY){
            result[i] = matrix[y][x];
            y++;
            i++;
        }
        y--;
        x--;
        maxX--;
        while(x >= minX){
            result[i] = matrix[y][x];
            x--;
            i++;
        }
        x++;
        y--;
        maxY--;
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
