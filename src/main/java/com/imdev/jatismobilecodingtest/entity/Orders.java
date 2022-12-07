package com.imdev.jatismobilecodingtest.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "orders")
public class Orders {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "purchase_order_number")
    private String purchaseOrderNumber;

    @Column(name = "ship_date")
    private String shipDate;

    @Column(name = "shipping_method_id")
    private Integer shippingMethodId;

    @Column(name = "freight_charge")
    private String freightCharge;

    @Column(name = "taxes")
    private String taxes;

    @Column(name = "payment_received")
    private String paymentReceived;

    @Column(name = "comment")
    private String comment;
}
