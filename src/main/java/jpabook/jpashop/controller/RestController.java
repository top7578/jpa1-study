package jpabook.jpashop.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = {"Food"})
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {

    @ApiOperation(value = "레스토랑 음식 추가", notes = "해당 레스토랑에 음식 추가")
    @GetMapping("/restaurant")
    public void addRestaurantFood() {

    }
}
