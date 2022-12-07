package com.imdev.jatismobilecodingtest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DefaultResponse<T> {

    private int status;

    private String message;

    private T data;
}
