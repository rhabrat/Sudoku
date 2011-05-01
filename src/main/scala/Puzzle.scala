package main.scala;

/**
 * @author Kuba
 * This is the main data element in this program, the Sudoku puzzle
 * It is basically a thin wrapper over a two-dimensional array of integers. (9x9)
 * With some added functionality.
 */
class Puzzle
{
	private val data = Array.ofDim[Int](9,9)
	
	def getCell(rowNumber: Int, colNumber: Int): Int =  data(rowNumber)(colNumber)
	def setCell(rowNumber: Int, colNumber: Int, value : Int) =  data(rowNumber)(colNumber) = value;
}