package com.cenylcz.domain.business;

import com.cenylcz.Category;
import com.cenylcz.PurchasedMethod;

import java.sql.Date;

public class Transaction {

    private Integer transactionKey;
    private Double amount;
    private Date transactionDate;
    private PurchasedMethod purchasedMethod;
    private Category category;
    private String merchant;
    private Double saving;

    public Integer getTransactionKey() {
        return transactionKey;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public PurchasedMethod getPurchasedMethod() {
        return purchasedMethod;
    }

    public Category getCategory() {
        return category;
    }

    public String getMerchant() {
        return merchant;
    }

    public Double getSaving() {
        return saving;
    }
}
