package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare{
	
	private int iSize;
	private int iSqrtSize;
	
	public Sudoku(int iSize) throws java.lang.Exception {
		if (Math.sqrt(iSize) == (int)(Math.sqrt(iSize))) {
			int iSqrtSize = (int) Math.sqrt(iSize);
		}else throw new java.lang.Exception();
	}
	
	public Sudoku(int[][] latinSquare) throws java.lang.Exception {
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

