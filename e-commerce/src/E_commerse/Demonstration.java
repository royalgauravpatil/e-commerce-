package E_commerse;

public class Demonstration {

	public static void main(String[] args) {
		LoginSystem loginSystem = new LoginSystem();

		Customer customer1 = new Customer(1, "Gaurav Patil", "Gaurav@1234", "gauravpatil742002@gmail.com");
		Admin admin1 = new Admin(2, "gaurav", "Gaurav@0704", "gauravspatil0704@gamil.com");

		loginSystem.register(customer1);
		loginSystem.register(admin1);

		Product product1 = new Product(1, "Laptop", 1000.0, 10, "Electronics");
		Product product2 = new Product(2, "Phone", 500.0, 20, "Electronics");
		Product product3 = new Product(3, "", 5000.0, 1, "Electronics");

		loginSystem.login("gaurav", "Gaurav@0704");
		if (loginSystem.isAdmin()) {
			Admin admin = (Admin) loginSystem.getLoggedInUser();
			admin.addProduct(product1);
			admin.addProduct(product2);
			admin.addProduct(product3);
			admin.updateProduct(product1);
		}
		loginSystem.logout();

		loginSystem.login("Gaurav Patil", "Gaurav@1234");
		if (loginSystem.isCustomer()) {
			Customer customer = (Customer) loginSystem.getLoggedInUser();
			customer.viewProfile();
			customer.addToCart(product1);
			customer.addToCart(product2);
			customer.checkout();

			Product[] orderedProducts = { product1, product2, product3 };
			Order order = new Order(1, customer.getUserId(), orderedProducts);
			order.placeOrder();
			order.trackOrder();
			order.cancelOrder();
		}
		loginSystem.logout();
	}

}
