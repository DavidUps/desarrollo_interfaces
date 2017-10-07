package sudo;

public class Principal {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub

		Sudoku prueba = new Sudoku();

		boolean solved = prueba.solve(new Cell(0, 0));
		if (!solved) {
			System.out.println("SUDOKU cannot be solved.");
			return;
		}

		System.out.println("SOLUTION\n");

		printGrid(prueba.getGrid());*/

	}

	// utility to print the grid
	static void printGrid(int grid[][]) {
		for (int row = 0; row < Sudoku.getN(); row++) {
			for (int col = 0; col < Sudoku.getN(); col++)
				System.out.print(grid[row][col]);
			System.out.println();
		}
	}

}
