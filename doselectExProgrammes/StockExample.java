package doselectExProgrammes;
class StockHighException extends Exception {
    public StockHighException(String message) {
        super(message);
    }
}

// Custom Exception for Low Stock Rate
class StockLowException extends Exception {
    public StockLowException(String message) {
        super(message);
    }
}
class Stock {
    private float stockRate;

    public Stock(float stockRate) {
        this.stockRate = stockRate;
    }

    public String checkRate(float rate) throws StockHighException, StockLowException {
        if (rate == 0.8 * stockRate) {
            return "Hope to raise";
        } else if (rate < 0.8 * stockRate) {
            throw new StockLowException("Under Loss");
        } else if (rate > 0.8 * stockRate) {
            throw new StockHighException("Under Profit");
        }
        return "";
    }
}
public class StockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Stock stock = new Stock(10.0f);
            System.out.println(stock.checkRate(7.0f)); // Should throw StockLowException
        } catch (StockLowException e) {
            System.out.println("StockLowException: " + e.getMessage());
        } catch (StockHighException e) {
            System.out.println("StockHighException: " + e.getMessage());
        }

	}
	

}
