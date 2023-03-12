package com.sun.springBoot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RequiredArgsConstructor /* final 이 포함된 필드의 생성자 생성 */
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
