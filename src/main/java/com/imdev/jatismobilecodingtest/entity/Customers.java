package com.imdev.jatismobilecodingtest.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name = "customers")
public class Customers {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "city")
    private String city;
    
    @Column(name = "state_or_province")
    private String stateOrProvince;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "email")
    private String email;

    @Column(name = "company_website")
    private String companyWebsite;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "fax_number")
    private String faxNumber;

    @Column(name = "ship_address")
    private String shipAddress;

    @Column(name = "ship_city")
    private String shipCity;

    @Column(name = "ship_state_or_province")
    private String shipStateOrProvince;

    @Column(name = "ship_zip_code")
    private String shipZipCode;

    @Column(name = "ship_phone_number")
    private String shipPhoneNumber;
}
