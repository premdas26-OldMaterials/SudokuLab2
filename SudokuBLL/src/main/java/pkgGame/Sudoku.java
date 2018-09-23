package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {

	private int iSize;
	private int iSqrtSize;

	public Sudoku(int iSize) throws java.lang.Exception {
		super();
		if (Math.sqrt(iSize) == (int) (Math.sqrt(iSize))) {
			int iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new java.lang.Exception();
	}

	public Sudoku(int[][] latinSquare) throws java.lang.Exception {
		super(latinSquare);
	}

	protected int[][] getPuzzle() {
		return super.getLatinSquare();
	}

	protected int[] getRegion(int r) {
		int[] reg = new int[super.getLatinSquare().length];

		int i = (r % iSqrtSize) * iSqrtSize;
		int j = (r / iSqrtSize) * iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt = 0;

		for (; j < jMax; j++) {
			for (i = (r % iSqrtSize) * iSqrtSize; i < iMax; i++) {
				System.out.println("J: " + j + "    " + "I: " + i);
				reg[iCnt++] = super.getLatinSquare()[j][i];
			}
		}
		return reg;
	}

	protected int[] getRegion(int col, int Row) {
		int region = (col / iSqrtSize) + 3 * (Row / iSqrtSize);
		return getRegion(region);
	}

	protected boolean isSudoku() {
		return false;
	}

	protected boolean isPartialSudoku() {
		return false;
	}

	public boolean isValidValue(int iCol, int iRow, int iValue) {
		return false;
	}
}
