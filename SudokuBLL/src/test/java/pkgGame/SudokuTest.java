package pkgGame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SudokuTest {

	@Test
	public void getRegion_test1() throws java.lang.Exception {
		
		int[][] sud = {{1,2,3,4,5,6,7,8,9},{2,3,4,5,6,7,8,9,1},{3,4,5,6,7,8,9,1,2},{4,5,6,7,8,9,1,2,3},{5,6,7,8,9,1,2,3,4},{6,7,8,9,1,2,3,4,5},{7,8,9,1,2,3,4,5,6},{8,9,1,2,3,4,5,6,7},{9,1,2,3,4,5,6,7,8}};
		Sudoku s = new Sudoku(sud);
		int[] expectedRegion = {7,8,9,8,9,1,9,1,2};
		assertTrue(Arrays.equals(s.getRegion(2), expectedRegion));
		
	}
	
	@Test
	public void getRegionRowColTest1() throws java.lang.Exception {
		int [] [] arr = {{1,2,3,4},{2,3,4,1},{3,4,2,1},{4,2,3,1}};
		Sudoku puzzle = new Sudoku(arr);
		int [] reg0 = {1,2,2,3};
		assertTrue(Arrays.equals(puzzle.getRegion(0,0), reg0));
	}
	
	@Test
	public void isSudoku_test1() throws java.lang.Exception{
		int[][] puzz = {{1,3,4,2},{2,4,3,1},{3,1,2,4},{4,2,1,3}};
		Sudoku s = new Sudoku(puzz);
		assertTrue(s.isSudoku());
		
	}
	
	@Test
	public void isSoduku_test2() throws java.lang.Exception {
		int[][] puzz = {{1,2,3,4},{4,1,2,3},{3,4,1,2},{2,3,4,1}};
		Sudoku s = new Sudoku(puzz);
		assertFalse(s.isSudoku());
	}
	
	@Test
	public void getPuzzleTest() throws java.lang.Exception {
		int [] [] arr = {{1,2,3,4},{2,3,4,1},{3,4,2,1},{4,2,3,1}};
		Sudoku puzzle = new Sudoku(arr);
		assertTrue(Arrays.equals(puzzle.getPuzzle(), arr));
	}
	
	@Test 
	public void partialSudokuTest1() throws java.lang.Exception {
		int [][] arr = {{1,0,3,4},{3,4,0,2},{2,1,4,3},{0,3,2,1}};
		Sudoku puzzle = new Sudoku(arr);
		assertTrue(puzzle.isPartialSudoku());
	}
	
	@Test 
	public void partialSudokuTest2() throws java.lang.Exception {
		int [][] arr = {{1,0,3,4},{3,4,2,0},{2,1,4,3},{0,3,2,4}};
		Sudoku puzzle = new Sudoku(arr);
		assertFalse(puzzle.isPartialSudoku());
	}
	
}
