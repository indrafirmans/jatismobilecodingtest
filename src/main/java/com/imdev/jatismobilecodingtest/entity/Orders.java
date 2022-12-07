package com.imdev.jatismobilecodingtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderID;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "purchase_order_number")
    private String purchaseOrderNumber;

    @Column(name = "ship_date")
    private String shipDate;

    @Column(name = "shipping_method_id")
    private String shippingMethodId;

    @Column(name = "freight_charge")
    private String freightCharge;

    @Column(name = "taxes")
    private String taxes;

    @Column(name = "payment_received")
    private String paymentReceived;

    @Column(name = "comment")
    private String comment;
}
