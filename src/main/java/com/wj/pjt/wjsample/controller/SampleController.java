package com.wj.pjt.wjsample.controller;

import com.wj.pjt.wjsample.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String indexPage() {
        return "쿠버네티스 역량 강화 스터디 아자아자!! :)";
    }

    @GetMapping("/sample")
    public ResponseEntity<ApiResponse> sampleData() {
        ApiResponse apiResponse = ApiResponse.builder()
                .result("/sample url 호출")
                .resultCode(200)
                .resultMsg("호출 성공")
                .build();

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
