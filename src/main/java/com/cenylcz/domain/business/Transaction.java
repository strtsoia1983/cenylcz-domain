package com.cenylcz.domain.business;

import com.cenylcz.Model;
import com.cenylcz.constants.Category;
import com.cenylcz.constants.PurchasedMethod;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "transaction", schema = "business")
public class Transaction extends Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_key", unique = true, nullable = false)
    private Integer transactionKey;

    @Column(name = "amount", nullable = false, precision = 8, scale = 2)
    private Double amount;

    @Column(name = "transaction_date", nullable = false)
    private Timestamp transactionDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "purchased_method", nullable = false)
    private PurchasedMethod purchasedMethod;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "merchant", nullable = false, length = 50)
    private String merchant;

    @Column(name = "saving", nullable = false, precision = 8, scale = 2)
    private Double saving;

    public Integer getTransactionKey() {
        return transactionKey;
    }

    public void setTransactionKey(Integer transactionKey) {
        this.transactionKey = transactionKey;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public PurchasedMethod getPurchasedMethod() {
        return purchasedMethod;
    }

    public void setPurchasedMethod(PurchasedMethod purchasedMethod) {
        this.purchasedMethod = purchasedMethod;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public Double getSaving() {
        return saving;
    }

    public void setSaving(Double saving) {
        this.saving = saving;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionKey=" + transactionKey +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", purchasedMethod=" + purchasedMethod +
                ", category=" + category +
                ", merchant='" + merchant + '\'' +
                ", saving=" + saving +
                '}';
    }
}
