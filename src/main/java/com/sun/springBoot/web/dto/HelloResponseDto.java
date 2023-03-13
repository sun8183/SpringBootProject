package com.sun.springBoot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor /* final 이 포함된 필드의 생성자 생성 */
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
