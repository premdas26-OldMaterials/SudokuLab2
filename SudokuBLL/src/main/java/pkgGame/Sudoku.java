package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare{
	
	public Sudoku() {
		super();
	}
	
	public Sudoku(int[][] latinSquare) {
		super(latinSquare);
	}
	
	protected int[][] getPuzzle(){
		return super.getLatinSquare();
	}
	
	protected int[] getRegion(int iRegionNbr) {
		return null;
	}
	
	protected int[] getRegion(int col, int Row) {
		return null;
	}
	
	protected boolean isSudoku() {
		return false;
	}
	
	protected boolean isPartialSudoku() {
		return false;
	}
}

