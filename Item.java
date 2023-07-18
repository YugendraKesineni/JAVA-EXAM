class Item {
	private String productName;
	private int quantity;
	private double unitPrice;

	/*
	 * 1. Implement the constructor
	 */
	Item(String productName, int quantity, double unitPrice) {
		// Write code here
	}
	public String toString() {
		String s = this.productName + ":";
		s = s + this.quantity + "\n";
		return s;
	}

	/*
	 * 2. Implement this method
	 */
	public String getProductName() {
		// Write Code here
	}

	/*
	 * 3. Implement this method
	 */
	public int getQuantity() {
		// Write Code here
	}

	/*
	 * 4. Implement this method
	 */
	public double getUnitPrice() {
		// Write Code here
	}
}