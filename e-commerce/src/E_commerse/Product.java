package E_commerse;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String category;

	public Product(int productId, String productName, double price, int quantity, String category) {
		this.productId = productId;
		setProductName(productName);
		setPrice(price);
		setQuantity(quantity);
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		if (productName == null || productName.trim().isEmpty()) {
			System.out.println("Invalid product name.");
		} else {
			this.productName = productName;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Price cannot be negative.");
		} else {
			this.price = price;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			System.out.println("Quantity cannot be negative.");
		} else {
			this.quantity = quantity;
		}
	}

	public String getCategory() {
		return category;
	}

	public String getProductDetails() {
		return "ID: " + productId + ", Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity
				+ ", Category: " + category;
	}

	public void updateQuantity(int newQuantity) {
		setQuantity(newQuantity);
	}

	public void updatePrice(double newPrice) {
		setPrice(newPrice);
	}
}
