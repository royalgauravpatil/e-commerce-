package E_commerse;

public class Admin extends User {
    public Admin(int userId, String username, String password, String email) {
        super(userId, username, password, email);
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile - Username: " + getUsername() + ", Email: " + getEmail());
    }

    @Override
    public void updateProfile(String newUsername, String newPassword, String newEmail) {
        System.out.println("Updating profile for " + getUsername());
        // Assuming validation is successful
        System.out.println("Profile updated.");
    }

    public void addProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " added.");
    }

    public void removeProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " removed.");
    }

    public void updateProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " updated.");
    }
}
