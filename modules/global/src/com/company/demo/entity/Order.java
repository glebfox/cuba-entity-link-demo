package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "DEMO_ORDER")
@Entity(name = "demo$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -7070888215576624937L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }


}