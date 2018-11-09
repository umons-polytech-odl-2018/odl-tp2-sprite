package exercise2;

public class ProductionWorker {
	private int producedPieceRate;
	private int producedPiece = 0;

	public ProductionWorker (int producedPieceRate){

	}


	public void produceOnePiece() {
		producedPiece++;


	}

	public int computeSalary() {

		return producedPiece * producedPieceRate;
	}
}
