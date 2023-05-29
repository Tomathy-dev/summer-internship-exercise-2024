package com.premiumminds.internship.snail;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aamado on 05-05-2023.
 * Test class for SnailShellPattern
 * This class will test the SnailShellPattern class
 * 3x3 test provided by Premium Minds
 * @author Tomás Salgueiro github.com/Tomathy-dev
 */
@RunWith(JUnit4.class)
public class SnailShellPatternTest {

  /**
   * The corresponding implementations to test.
   *
   * If you want, you can make others :)
   *
   */
  public SnailShellPatternTest() {
  };

  /**
   * Test for a 0x0 matrix
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws TimeoutException
   */
  @Test
  public void SnailShellPattern0LengthTest() throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { {} };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {};
    assertArrayEquals(result, expected);
  }

  /**
   * Test for a 1x1 matrix
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws TimeoutException
   */
  @Test
  public void SnailShellPattern1LengthTest() throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { {1} };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = {1};
    assertArrayEquals(result, expected);
  }

  /**
   * Test for a 2x2 matrix
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws TimeoutException
   */
  @Test
  public void SnailShellPattern2LengthTest() throws InterruptedException, ExecutionException, TimeoutException {
      int[][] matrix = { {1,2}, {4,3} };
      Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
      int[] result = count.get(10, TimeUnit.SECONDS);
      int[] expected = {1,2,3,4};
      assertArrayEquals(result, expected);
  }
  /**
   * Test for a 3x3 matrix
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws TimeoutException
   */
  @Test
  public void ScreenLockinPatternTestFirst3Length2Test()
      throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertArrayEquals(result, expected);
  }

  /**
   * Test for a 5x5 matrix
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws TimeoutException
   */
  @Test
  public void SnaiShellPattern5LengthTest() throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
        { 13, 12, 11, 10, 9 } };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
    assertArrayEquals(result, expected);
  }

  /**
   * Test for wrong expected of a 3x3 matrix
   * @throws InterruptedException
   * @throws ExecutionException
   * @throws TimeoutException
   */
  @Test
  public void SnailShellPatternWrongResult() throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertFalse((result.equals(expected)));
  }
}


