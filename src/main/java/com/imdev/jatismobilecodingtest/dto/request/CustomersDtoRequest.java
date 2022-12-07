package com.imdev.jatismobilecodingtest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomersDtoRequest {

    private String companyName;

    private String firstName;

    private String lastName;

    private String billingAddress;

    private String city;
    
    private String stateOrProvince;

    private String zipCode;

    private String email;

    private String companyWebsite;

    private String phoneNumber;

    private String faxNumber;

    private String shipAddress;

    private String shipCity;

    private String shipStateOrProvince;

    private String shipZipCode;

    private String shipPhoneNumber;
}
