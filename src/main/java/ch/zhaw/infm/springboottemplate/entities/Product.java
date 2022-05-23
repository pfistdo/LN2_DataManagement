package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    private LocalDate bestBeforeDate;
    private double price;
    private String name;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Person seller;

    @ManyToOne
    private Person buyer;

    public Product() {
    }

    public Product(long productId, LocalDate bestBeforeDate, double price, String name, Category category, Person seller, Person buyer) {
        this.productId = productId;
        this.bestBeforeDate = bestBeforeDate;
        this.price = price;
        this.name = name;
        this.category = category;
        this.seller = seller;
        this.buyer = buyer;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(LocalDate bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }
}
