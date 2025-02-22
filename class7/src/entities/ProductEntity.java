package entities;

public class ProductEntity {

    private String name;

    private int cuantity;

    public ProductEntity(int cuantity, String name) {
        this.cuantity = cuantity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "name='" + name + '\'' +
                ", cuantity=" + cuantity +
                '}';
    }

    public ProductEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCuantity() {
        return cuantity;
    }

    public void setCuantity(int cuantity) {
        this.cuantity = cuantity;
    }
}
