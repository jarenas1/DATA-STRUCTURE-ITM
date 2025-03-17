package partialExample.entities;

import java.math.BigDecimal;

public class Spare {
    private String brand;
    private String reference;
    private Long cuantity;
    private BigDecimal price;

    public Spare() {
    }

    public Spare(String brand, String reference, Long cuantity, BigDecimal price) {
        this.brand = brand;
        this.reference = reference;
        this.cuantity = cuantity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getCuantity() {
        return cuantity;
    }

    public void setCuantity(Long cuantity) {
        this.cuantity = cuantity;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
