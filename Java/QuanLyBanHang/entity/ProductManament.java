package QuanLyBanHang.entity;

public class ProductManament {
    private Employee employee;
    private Product[] products;

    public ProductManament(Employee employee, Product[] products) {
        this.employee = employee;
        this.products = products;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
